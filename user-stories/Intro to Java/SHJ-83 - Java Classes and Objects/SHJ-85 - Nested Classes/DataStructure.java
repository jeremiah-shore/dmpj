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

        //print out only values of odd indices
        ds.print(
            new DataStructureIterator() {
                private int nextIndex = 1;
                public boolean hasNext() {
                    return (nextIndex <= ds.getSize() - 1);
                }
                public Integer next() {
                    Integer retValue = Integer.valueOf(ds.getArrayOfInts()[nextIndex]);
                    nextIndex += 2;
                    return retValue;
                }
                public void remove() {} //just to get the compiler to cooperate wit this example
            }
        );
    }

}