package com.assignment6;

import java.util.ArrayList;

public class UpperCase {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("akshay");
		a.add("pavan");
		a.add("hello");
		a.add("heya");
		System.out.println("the list before is:");
		a.forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		a.replaceAll(e -> e.toUpperCase());
		System.out.println("the list after replacing is : ");
		a.forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		

	}

}
