class Exercise8 {
	public static void main(String[] args) {

	}

	public static <T extends Comparable> findMax(List<T> list) {
		T max = null;
		for(T elem : list)
			if(max == null || elem.compareTo(max) > 0)
				max = elem;
		return max;
	}
}