package com.assignment4;

import java.util.ArrayList;

public class Odd {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("akshay");
		a.add("pavan");
		a.add("hello");
		a.add("heya");
		System.out.println("the list before removing");
		a.forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		a.removeIf(e -> (e.length()%2!=0));
		System.out.println("the list after removing");
		a.forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		

	}

}
