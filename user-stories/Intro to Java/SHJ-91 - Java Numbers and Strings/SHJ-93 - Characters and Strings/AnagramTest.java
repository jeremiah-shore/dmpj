import java.util.HashMap;
import java.util.Map;

class AnagramTest {

	public static void main(String[] args) {
		if(args.length != 2)
			throw new IllegalArgumentException(
				"need exactly 2 words to test if an anagram, " + args.length + "word(s) provided");

		String string1 = cleanString(args[0].toLowerCase().trim());
		String string2 = cleanString(args[1].toLowerCase().trim());

		boolean result = isAnagramStrict(string1, string2);
		String descriptor = "";
		if(!result) descriptor = "not ";

		System.out.printf("%b%n%s is %san anagram of %s",
			result, string2, descriptor, string1);

	}

	private static String cleanString(String str) {
		StringBuilder result = new StringBuilder();
		for(char c : str.toCharArray())
			if(Character.isLetter(c))
				result.append(c);
		return result.toString();
	}

	public static boolean isAnagramStrict(String str1, String str2) {
		if(str1.length() != str2.length()) 
			return false;

		Map<Character, Integer> charCountMap = buildCharCountMap(str1);
		for(char c : str2.toCharArray()) {
			if(!charCountMap.containsKey(c) || charCountMap.get(c) == 0)
				return false;
			else {
				int newCount = charCountMap.get(c) - 1;
				charCountMap.put(c, newCount);
				//System.out.printf("%c: %d%n", c, newCount);
			}
		}
		return true;
	}

	private static Map<Character, Integer> buildCharCountMap(String str) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(charCountMap.containsKey(c)) {
				int newCount = charCountMap.get(c) + 1;
				charCountMap.put(c, newCount);
				//System.out.printf("%c: %d%n", c, newCount);
			} else {
				charCountMap.put(c, 1);
				//System.out.printf("%c: %d%n", c, 1);
			}
		}
		//System.out.println();
		return charCountMap;
	}

	

}