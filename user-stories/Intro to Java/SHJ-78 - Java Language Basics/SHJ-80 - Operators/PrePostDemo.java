class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;                     
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"

        //in lines 8 and 9 above, 6 is printed twice in a row
        //this happens because when line 8 runs, the value of i is incremented by one BEFORE the rest of the statement
        //as a result, i = 6 before System.out.println() executes
        //then on line 9, the value of i is incremented by one AFTER the rest of the statement executes
        //as a result i = 6 when System.out.println() executes, and then it is incremented to 7
    }
}