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
    
    
    public void print(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    

    public void print(Function<Integer, Boolean> function) {
        for(int i : arrayOfInts) {
            if(function.apply(i))
                System.out.print(i + " "); 
        }
        System.out.println();
    }

    private int getSize() {
        return SIZE;
    }

    private int[] getArrayOfInts() {
        return arrayOfInts;
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 
    
    public static void main(String s[]) {
        
        // Fill the array with integer values
        final DataStructure ds = new DataStructure();

        //print out only values of even indices
        ds.print(index -> {
                if(index % 2 == 0)
                    return true;
                return false;
            }
        );

        //print out only values of odd indices
        ds.print(index -> {
                if(index %2 == 1)
                    return true;
                return false;
            }
        );
    }

}