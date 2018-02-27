class DisplayInitials {
	public static void main(String[] args) {
		String name = "Jeremiah Shore";
		String result = "";

		String[] subNames = name.split(" ");
		for(String sn : subNames) {
			result += sn.trim().charAt(0);
		}

		System.out.printf("The initials for the name \"%s\" are %s.",
			name, result);
	}
}