package Day4;

import java.util.Scanner;

public class Attendance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Students : ");
		int student = sc.nextInt();
		
		sc.nextLine();
		
		String[] names = new String[student];
		String[] attendance = new String[student];
		
		
		for(int i=0;i<student;i++) {
			System.out.print("Enter the names of student "+(i+1)+": ");
			names[i]=sc.nextLine();
		}
		System.out.println("\nMark Attendance (P for Present /A for Absent)");
		for(int i=0;i<student;i++) {
			System.out.println(names[i]+": ");
			attendance[i]=sc.nextLine().toUpperCase().equals("P")?"Present" : "Absent" ;
		}
		
		System.out.println("\n--------Attendance Report---------------");
		for(int i=0;i<student;i++) {
			System.out.println(names[i]+" - "+attendance[i]);
		}
	}

}