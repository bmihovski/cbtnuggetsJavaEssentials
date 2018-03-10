package cbtnuggetsJavaEssentials;

public class ErrorHandling {

	public static void main(String[] args) {
		
		String[] names = { "Ben", "Amy", "Kim" };
		
		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println(names[i]);
			}
		}
		
		catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println(ex);
		}
		
		try {
			int num1 = 0;
			int num2 = 10;
			int num3 = num1 / num2;
		}
		
		catch (ArithmeticException ex) {
			System.out.println("Hey! Divide by zero is uncool dude!");
		}
		
		System.out.println("The program is complete!");

	}

}
