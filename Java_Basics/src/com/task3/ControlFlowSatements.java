package com.task3;

public class ControlFlowSatements {

	public static void main(String[] args) {
		int aNumber = 3;
		if (aNumber >= 0)
			if (aNumber == 0)
				System.out.println("first string");
			else
				System.out.println("second string");
		System.out.println("third string");
		// TODO Auto-generated method stub
		//// a
		//// second string
		// third string
		// b same as a
		//c
		if (aNumber >= 0)
			     if (aNumber == 0)
				       System.out.println("first string");
			     else
				       System.out.println("second string");
		System.out.println("third string");

		// d
		if (aNumber >= 0) {
			if (aNumber == 0) {
				System.out.println("first string");

			} else {
				System.out.println("second string");
			}
			System.out.println("third string");
		}

	}

}
