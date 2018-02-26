import java.util.function.*;

public class DataStructure {
    
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void print(Function<Integer, Boolean> function) {
        for(int i : arrayOfInts) {
            if(function.apply(i))
                System.out.print(i + " "); 
        }
        System.out.println();
    }

    //lack of the static keyword here gave me A LOT of trouble :(
    public static Boolean isEven(int integer) {
        if(integer % 2 == 0)
            return true;
        return false;
    }

    public  static Boolean isOdd(int integer) {
        return !isEven(integer);
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 
    
    public static void main(String s[]) {
        final DataStructure ds = new DataStructure();

        //print out only values of even indices
        ds.print(DataStructure::isEven);

        //print out only values of odd indices
        ds.print(DataStructure::isOdd);
    }

}