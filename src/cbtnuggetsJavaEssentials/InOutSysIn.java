package cbtnuggetsJavaEssentials;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class InOutSysIn {

	public static void main(String[] args) {
		
		Scanner kb;
		
		kb = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name;
		name = kb.nextLine();
		System.out.println("My name is " + name);
		
		System.err.println("Error Will Robinson!");
		
	}

}
