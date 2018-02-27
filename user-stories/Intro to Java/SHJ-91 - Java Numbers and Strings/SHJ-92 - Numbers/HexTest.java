class HexTest {
	public static void main(String[] args) {
		final int hexBase = 16;

		int number = 65;
		System.out.printf("Integer.toString(%d, %d) returns \"%s\"%n", 
			number, hexBase, Integer.toString(number, 16));
		System.out.printf("Integer.toHexString(%d) returns \"%s\"%n",
			number, Integer.toHexString(number));
		
		number = -number;
		System.out.printf("Integer.toString(%d, %d) returns \"%s\"%n", 
			number, hexBase, Integer.toString(number, 16));
		System.out.printf("Integer.toHexString(%d) returns \"%s\"%n",
			number, Integer.toHexString(number));
	}
}