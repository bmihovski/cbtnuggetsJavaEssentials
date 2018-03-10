package cbtnuggetsJavaEssentials;

public class Loop {

	public static void main(String[] args) {
		
		int number = 57;
		boolean isPrime = true;
		
		for (int test = 2; test < number; test ++) {
			if (number % test == 0) {
				isPrime = false;
				System.out.println(number + " is divisible by " + test);
				break;
			}
			System.out.println(test);
		}
		
		if (isPrime) {
			System.out.println("This is a prime number!");
		}
		else {
			System.out.println("This is not a prime number!");
		}
		
	}

}
