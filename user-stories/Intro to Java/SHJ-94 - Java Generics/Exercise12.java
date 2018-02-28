/*
How do you invoke the following method to find the first integer in a list that is relatively prime 
to a list of specified integers?

public static <T> int findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p)

Note that two integers a and b are relatively prime if gcd(a, b) = 1, where gcd is short for 
greatest common divisor.

*/

import java.util.*;

class Exercise8 {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(3, 4, 6, 8, 11, 15, 28, 32);
        Collection<Integer> c = Arrays.asList(7, 18, 19, 25);
        UnaryPredicate<Integer> p = new RelativelyPrimePredicate(c);

        int i = ALgorithm.findFirst(li, 0, li.size(), p);

        if (i != -1) {
            System.out.print(li.get(i) + " is relatively prime to ");
            for (Integer k : c)
                System.out.print(k + " ");
            System.out.println();
        }
	}

	public static <T> int findFirst(List<T> list, UnaryPredicate<T> p) {
		for(T elem : list)
			if(p.test(elem))
				return elem;
		return -1;
	}

	public static <T> int findFirstRangeInclusive(List<T> list, int begin, int end, UnaryPredicate<T> p) {
		List<T> range = list.subList(begin, ++end);
		return findFirst(range, p);
	}

	interface UnaryPredicate<T> {
		boolean test(T t);
	}

	class RelativelyPrimePredicate implements UnaryPredicate<Integer> {
		private Collection<Integer> c;

		RelativelyPrimePredicate(Collection<Integer> c) {
			this.c = c;
		}

		boolean test(Integer x) {
			for(Integer i : c)
				if(findGCD(x, i) != 1)
					retrun false;
			return c.size() > 0;
		}

		static int findGCD(int x, int y) {
			//copied from answer to save time; this algorithm isn't the focus of this lesson
        	for (int r; (r = x % y) != 0; x = y, y = r) { }
            return y;
		}
	}
}