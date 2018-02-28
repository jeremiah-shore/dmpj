import java.util.*;

class Exercise3 {
	public static void main(String[] args) {

	}

	//leaving the obvious ArrayOutOfBoundsException along for the time being
	public static <T> void swapPosition(T[] t, int index1, int index2) {
		T temp = t[index1];
		t[index1] = t[index2];
		t[index2] = temp;
	}
}