package com;

import java.util.Random;

public class EmployeeWage {
	int empWageperHer = 20;
	int hour = 0;
	int wage = 0;
	int Dailywage = 0;
	int Totalwage = 0;
	int count = 0;
	int i;
	int dayzPerMonth = 20;
	int Total_max_hour = 100;
	int Totalhour = 0;

	public void dailwage() {
		for (i = 0; i < dayzPerMonth && Totalhour <= Total_max_hour; i++) {
			Random ran = new Random();
			int ran_int = ran.nextInt(3);
			switch (ran_int) {
			case 1:
				hour = 8;
				break;
			case 2:
				hour = 4;
				break;
			case 0:
				hour = 0;
				break;
			default:
				System.out.println("wrong input");
			}
			Totalhour = Totalhour + hour;
			Dailywage = empWageperHer * hour;
			Totalwage = Dailywage + Totalwage;
			count++;
		}
		System.out.println("Total wage for Month is " + Totalwage);
		System.out.println("Total hour is " + Totalhour);
		System.out.println("Total days of working " + i);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation program");
		EmployeeWage e = new EmployeeWage();
		e.dailwage();

	}

}