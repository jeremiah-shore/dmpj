class Snippet { 

	public static void main(String[] args) {
		int aNumber = 3;

		if (aNumber >= 0)
		    if (aNumber == 0)
		        System.out.println("first string");
		else System.out.println("second string");
		System.out.println("third string");
	}

	/*answer to 1a: 
		second string
		third string
	*/

	/*answer to 1b:
		The output matches what I predicted in my answer to 1a.
		
		This is because the aNumber >= 0 expression evaluates to false in the first condition. The second if 
		statement is nested and is never checked; once the first if evaluates to false the else statement is 
		executed, printing out "second string". The statement that prints "third string" has no conditions and 
		will always execute.
	*/

}