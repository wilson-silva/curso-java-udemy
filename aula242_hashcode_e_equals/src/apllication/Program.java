package apllication;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		String a = "Maria";
		String b = "Alex";

		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println("-------------------------------------------");

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);

		System.out.println("-------------------------------------------");
		
		String s1 = "Test";
		String s2 = "Test";
		System.out.println(s1 == s2);

	}

}
