import java.util.*;
import java.util.function.*;

public final class Algorithm {

    public static <T> int findFirst(List<T> list, Predicate<T> p) {
        for(T elem : list)
            if(p.test(elem))
                return list.indexOf(elem);
        return -1;
    }

    public static <T> int findFirstRangeEndExclusive(List<T> list, int begin, int end, Predicate<T> p) {
        List<T> range = list.subList(begin, end);
        return findFirst(range, p);
    }

    // x > 0 and y > 0
    public static int gcd(int x, int y) {
        for (int r; (r = x % y) != 0; x = y, y = r) { }
            return y;
    }
}