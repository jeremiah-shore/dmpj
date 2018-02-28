/*
How do you invoke the following method to find the first integer in a list that is relatively prime 
to a list of specified integers?

public static <T> int findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p)

Note that two integers a and b are relatively prime if gcd(a, b) = 1, where gcd is short for 
greatest common divisor.

*/

class Exercise8 {
	public static void main(String[] args) {

	}

	public static <T> int findFirst(List<T> list, UnaryPredicate<T> p) {
		
	}

	public static <T> int findFirstRangeInclusive(List<T> list, int begin, int end, UnaryPredicate<T> p) {

	}

	interface UnaryPredicate<T> {
		boolean test(T t);
	}

	class RelativelyPrimePredicate implements UnaryPredicate<Integer> {

	}
}