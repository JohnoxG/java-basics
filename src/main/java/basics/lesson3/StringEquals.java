package basics.lesson3;

public class StringEquals {
	public static void main(String[] args) {
		String exampleInit = "My Text";
		String exampleNew = new String("My Text");

		if (exampleInit == exampleNew) {
			System.out.println("works by equals character");
		}
		if (exampleInit.equals(exampleNew)) {
			System.out.println("works by equals key word");
		}
	}
}
