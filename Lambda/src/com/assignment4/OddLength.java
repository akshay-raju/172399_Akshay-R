package com.assignment4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class OddLength {

	public static void main(String[] args) {
	Predicate<String> p=(s)->
	{
		if(s.length()%2==0)
		{
			return false;
		}
		else
			return true;
	};
	ArrayList<String> list=new ArrayList<String>();
	list.add("akshay");
	list.add("hello");
	list.add("kiran");
	list.add("heyu");
	list.add("four");
	System.out.println("before"+list);
	list.removeIf(p);
	System.out.println("after"+list);
	}
}
