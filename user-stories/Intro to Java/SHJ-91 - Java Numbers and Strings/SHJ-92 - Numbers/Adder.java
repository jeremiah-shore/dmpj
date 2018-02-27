public class Adder {
	public static void main(String[] args) {
		if(args.length <= 1) 
			throw new IllegalArgumentException(
				"need >= 2 integers to correctly calculate addtion output... <= 1 were provided");

		int result = 0;
		for(String arg : args) 
			result += Integer.parseInt(arg);
		
		System.out.println(result);
	}

}