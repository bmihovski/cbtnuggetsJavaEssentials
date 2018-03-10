package cbtnuggetsJavaEssentials;

public class FunctionsArgsReturn {

	public static void main(String[] args) {
		int bigger;
		
		bigger = whichIsBigger(5, 6);
		
		System.out.println(bigger + " is the larger number.");
		
		bigger = whichIsBigger(17, 2);
		
		System.out.println(bigger + " is the larger number.");
		
		bigger = whichIsBigger(1,  6);
		
		System.out.println(bigger + " is the larger number.");
		

	}

	private static int whichIsBigger(int firstNumber, int secondNumber) {
		if (firstNumber > secondNumber) {
			return firstNumber;
		}
		return secondNumber;
	}

}
