package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.println("How many students for course A?");
		int n = sc.nextInt();
		fillClass(a, n);
		
		System.out.println("How many students for course B?");
	    n = sc.nextInt();
		fillClass(b, n);
		
		System.out.println("How many students for course C?");
		n = sc.nextInt();
		fillClass(c, n);
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		sc.close();
		
	}
	
	private static void fillClass(Set<Integer> set, int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			int number = sc.nextInt();
			set.add(number);
		}
	}

}
