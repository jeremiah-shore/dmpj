import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Exercise1 {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>(
			Arrays.asList(1, 2, 3, 4, 5));
		System.out.printf("there are %d odd numbers in the array%n", countOdd(ints));

		List<Double> doubles = new ArrayList<>(
			Arrays.asList(1.1d, 2.2d, 3.0d, 4.0d, 5.0d, 6.8d, 7.9d));
		System.out.printf("there are %d odd numbers in the array%n", countOdd(doubles));
	}

	//not really sure how useful this is, but it works lol
	private static int countOdd(List<? extends Number> list) {
		int count = 0;
		for(Number n : list)
			if(n.intValue() % 2 == 1)
				count++;
		return count;
	}
}