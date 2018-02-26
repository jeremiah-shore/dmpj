class CharSequenceImplementation {

	private String value;

	CharSequenceImplementation(String value) {
		this.value = value;
	}

	public char charAt(int index) {
		return value.charAt(index);
	}

	public int length() {
		return value.length();
	}

	public CharSequence subSequence(int start, int end) {
		return	(CharSequence) value.substring(start, end);
	}

	//as instrcuted in Exercise 1, return the string backwards
	public String toString() {
		return new StringBuilder(value)
			.reverse()
			.toString();
	}

	public static void main(String[] args) {
		final String testCase = "Your implementation should return the string backwards.";
		CharSequenceImplementation csi = new CharSequenceImplementation(testCase);

		System.out.printf("charAt(10) = %c\n", csi.charAt(10));
		System.out.printf("length() = %d\n", csi.length());
		System.out.printf("subSequence(20, 30) = %s\n", csi.subSequence(20, 30));
		System.out.printf("toString() = %s\n", csi.toString());
	}

}