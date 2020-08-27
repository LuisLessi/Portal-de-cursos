package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();
		
		System.out.print("How many courses do you have?: ");
		int course = sc.nextInt();
		
		for (int i = 1; i < course + 1; i++) {
			System.out.print("How many students for course "+ i+"?: ");
			int quantity = sc.nextInt();
			for (int j = 0; j < quantity; j++) {
				System.out.print("Student code: ");
				int code = sc.nextInt();
			
				set.add(new Student(code));
			}
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}
