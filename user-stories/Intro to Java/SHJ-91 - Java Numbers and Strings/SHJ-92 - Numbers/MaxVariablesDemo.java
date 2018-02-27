public class MaxVariablesDemo {
    public static void main(String args[]) {
 
        //integers
        byte largestByte = Byte.MIN_VALUE;
        short largestShort = Short.MIN_VALUE;
        int largestInteger = Integer.MIN_VALUE;
        long largestLong = Long.MIN_VALUE;
 
        //real numbers
        float largestFloat = Float.MIN_VALUE;
        double largestDouble = Double.MIN_VALUE;
 
        //Display them all.
        System.out.println("The largest byte value is "
                           + largestByte + ".");
        System.out.println("The largest short value is "
                           + largestShort + ".");
        System.out.println("The largest integer value is "
                           + largestInteger + ".");
        System.out.println("The largest long value is "
                           + largestLong + ".");
 
        System.out.println("The largest float value is "
                           + largestFloat + ".");
        System.out.println("The largest double value is "
                           + largestDouble + ".");
    }

    /* SAMPLE OUTPUT:
      The largest byte value is -128.
      The largest short value is -32768.
      The largest integer value is -2147483648.
      The largest long value is -9223372036854775808.
      The largest float value is 1.4E-45.
      The largest double value is 4.9E-324.
    */
}