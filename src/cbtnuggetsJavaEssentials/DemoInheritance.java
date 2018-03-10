package cbtnuggetsJavaEssentials;

public class DemoInheritance {

	public static void main(String[] args) {
		
		CatInheritance c = new CatInheritance();
		
		c.name = "Ben";
		c.color = "Orange";
		
		DogInheritance d = new DogInheritance();
		
		System.out.println(c.sayHello());
		System.out.println(d.sayHello());

	}

}
