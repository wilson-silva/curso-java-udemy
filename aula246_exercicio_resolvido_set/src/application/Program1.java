package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.xml.sax.HandlerBase;

import entities.Log;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		String path = scan.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<Log> set = new HashSet<>();
			
			String line = br.readLine();
			while(line!=null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				set.add(new Log(username, moment));
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
