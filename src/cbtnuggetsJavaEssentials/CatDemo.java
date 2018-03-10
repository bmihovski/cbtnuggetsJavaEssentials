package cbtnuggetsJavaEssentials;

public class CatDemo {

	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		c1.color = "Red";
		c1.age = 5;
		c1.name = "Mr. Paws";
		
		Cat c2 = new Cat();
		c2.color = "Blue";
		c2.age = 3;
		c2.name = "Joey";
		
		System.out.println("Hello cat #1  " + c1.name);
		System.out.println(c1.sayHello());

	}

}
