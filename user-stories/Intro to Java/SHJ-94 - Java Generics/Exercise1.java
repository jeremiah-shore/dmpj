import java.util.*;
import java.util.function.*;

class Exercise1 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

		int count = countIf(nums, new EvenPredicate());
		System.out.printf("There are %d even numbers in the array%n", count);

		count = countIf(nums, new EvenPredicate().negate());
		System.out.printf("There are %d odd numbers in the array%n", count);
	}

	public static <T> int countIf(Collection<T> c, Predicate<T> p) {
		int count = 0;
		for(T elem : c)
			if(p.test(elem))
				count++;
		return count;
	}

	static class EvenPredicate implements Predicate<Integer> {
		public boolean test(Integer i) {
			return i % 2 == 0;
		}
	}
}