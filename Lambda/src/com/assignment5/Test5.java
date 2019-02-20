package com.assignment5;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		array.add("akshay");
		array.add("vinay");
		array.add("sanjay");
		array.add("faisal");
		System.out.println("String is :\n"+array);
		System.out.println("The first words of the Strings are-->");
	
		String stringresult = array.stream().map(e -> Character.toString(e.charAt(0))).reduce(" ", (a, b) -> a + b);
		System.out.println(stringresult);
	}

}
