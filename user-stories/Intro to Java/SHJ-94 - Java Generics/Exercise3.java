import java.util.*;

class Exercise3 {
	public static void main(String[] args) {
		Integer[] ints = {1, 2, 3, 4};

		System.out.println("before the swap");
		printArray(ints);

		swapPosition(ints, 0, 3);

		System.out.println("after the swap");
		printArray(ints);
	}

	//leaving the obvious ArrayOutOfBoundsException along for the time being
	public static <T> void swapPosition(T[] t, int index1, int index2) {
		T temp = t[index1];
		t[index1] = t[index2];
		t[index2] = temp;
	}

	public static <T> void printArray(T[] t) {
		System.out.printf("%nARRAY CONTENTS%n");
		for(T elem : t)
			System.out.printf("element: %s%n", elem);
		System.out.println();
	}
}