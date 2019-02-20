package com.assignment1;

public class ClientTest {
	public static void main(String[] args)
	{
		Arithematic addition = (a, b) -> (a + b);
		System.out.println("Addition = " + addition.operations(5, 6));
		Arithematic subtraction = (a, b) -> (a - b);
		System.out.println("subtraction = " + subtraction.operations(8, 6));
		Arithematic multiply = (a, b) -> (a * b);
		System.out.println("multiply = " + multiply.operations(2, 3));
		Arithematic division = (a, b) -> (a / b);
		System.out.println("division = " + division.operations(3, 3));
		};
	}


