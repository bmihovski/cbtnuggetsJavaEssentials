package cbtnuggetsJavaEssentials;


public class Arrays {

	public static void main(String[] args) {
		
		String[] names = { "Ben", "Kim", "Amy", "Joe", "Sam" };
		int[] ages = { 37, 19, 21, 15, 45 };
		
		for (int idx = 0; idx < ages.length; idx++) {
			
			if ( ages[idx] >= 21 ) {
				
				System.out.println("You are old enough to enter.");
				System.out.println("Welcome to the club " + names[idx]);
				
			}
			
			else if ( ages[idx] >= 18 ) {
				
				System.out.println("You are old enough to enter but not drink.");
				
			}
			
			else {
				
				System.out.println("Sorry you are too young to enter " + names[idx]);
				
			}
			
		}

	}

}
