import java.util.*;

class Exercise8 {
	public static void main(String[] args) {
		List<Integer> ints= Arrays.asList(1, 5, 10, 3, 7);
		int max = findMax(ints);
		System.out.printf("%d is the max element in the array%n", max);
	}

	public static <T extends Comparable<T>> T findMax(List<T> list) {
		T max = null;
		for(T elem : list)
			if(max == null || elem.compareTo(max) > 0)
				max = elem;
		return max;
	}
}