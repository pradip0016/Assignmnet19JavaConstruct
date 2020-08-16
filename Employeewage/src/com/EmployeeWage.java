package com;

import java.util.Random;

public class EmployeeWage {

	public void dailywage(int ran_int) {
		System.out.println("value " + ran_int);

		if (ran_int == 1) {
			System.out.println("Employee is present");
		} else if (ran_int == 2) {
			System.out.println("Employee is present part time");
		} else {
			System.out.println("Employee is absent");

		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation program");
		EmployeeWage e = new EmployeeWage();
		Random ran = new Random();
		int ran_int1 = ran.nextInt(3);
		e.dailywage(ran_int1);

	}

}
