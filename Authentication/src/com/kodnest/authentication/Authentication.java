package com.kodnest.authentication;

import java.util.Scanner;

public class Authentication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		String prefix = sc.next();
		sc.close();	
		
		boolean startsWithResult = findStartsWithResult(username, prefix);
		System.out.println(startsWithResult);
	}
	public static boolean findStartsWithResult(String username, String prefix) {
		boolean startsWithResult = username.startsWith(prefix);
		return startsWithResult;
	}
	                       //OR
//	public static boolean findStartsWithResult(String username, String prefix) {
//		boolean startsWithResult = username.contains(prefix);
//		return startsWithResult;
//	}
}