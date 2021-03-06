import java.util.*;
import java.util.function.*;

class RelativelyPrimePredicate implements Predicate<Integer> {
    private Collection<Integer> c;
    
    public RelativelyPrimePredicate(Collection<Integer> c) {
        this.c = c;
    }

    public boolean test(Integer x) {
        for (Integer i : c)
            if (Algorithm.gcd(x, i) != 1)
                return false;

        return c.size() > 0;
    }

}