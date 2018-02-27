public class FloatAdder {
	public static void main(String[] args) {
		if(args.length <= 1) 
			throw new IllegalArgumentException(
				"need >= 2 float arguments to correctly calculate addtion output... <= 1 were provided");

		float result = 0.0f;
		for(String arg : args)
			result += Float.valueOf(arg);

		System.out.printf("%.2f", result);
	}
}