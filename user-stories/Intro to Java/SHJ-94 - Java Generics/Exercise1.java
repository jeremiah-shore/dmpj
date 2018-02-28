import java.util.List;
import java.util.ArrayList;
import java.util.Function.*;

class Exercise1 {
	public static void main(String[] args) {

	}

	public static <T extends CharSequence> int countIf(Collection<T> c, Predicate<T> p) {
		int count = 0;
		for(T elem : c)
			if(p.test(elem))
				count++;
		return count;
	}
}