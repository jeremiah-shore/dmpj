class Snippet { 

	public static void main(String[] args) {
		int aNumber = 3;

		if (aNumber >= 0) {
		    if (aNumber == 0) {
		        System.out.println("first string");
		    } else {
				System.out.println("second string");
			}

		System.out.println("third string");
	}

	/*answer to 1a: 
		second string
		third string
	*/

	/*answer to 1b:
		The output matches what I predicted in my answer to 1a.
		
		3 >= 0 evaluates to true in the first condition. The second if statement is nested 
		and evaluates to false; then the else statement is executed, printing out "second string". 
		The statement that prints "third string" has no conditions and will always execute.
	*/

	//for some reason I botched the >= part and thought it would evaluate to false, and I also thought
	//that the else was part of the first if statement because of its indentation. Upon checking my answers,
	//the actual control flow is clear, and I've updated my answers to 1b and 1d	

}