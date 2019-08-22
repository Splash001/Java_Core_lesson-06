package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{

	@Override
	public void completion() {
		System.out.println("We add two numbers");
	}

	@Override
	public void subtraction() {
		System.out.println("We substract two numbers");
	}

	@Override
	public void multiplication() {
		System.out.println("We multiply two numbers");
	}

	@Override
	public void division() {
		System.out.println("We devide two numbers");
	}
	
}
