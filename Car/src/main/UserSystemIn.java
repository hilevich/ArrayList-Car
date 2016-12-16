package main;

import java.util.Scanner;

public class UserSystemIn {

	public static String getChange() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
		
	}
}
