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
		Collection<Integer> c;

		RelativelyPrimePredicate(Collection<Integer> c) {
			this.c = c;
		}

		boolean test(Integer i) {

		}

		static int findGCD(int x, int y) {
			//copied from answer to save time; this algorithm isn't the focus of this lesson
        	for (int r; (r = x % y) != 0; x = y, y = r) { }
            return y;
		}
	}
}