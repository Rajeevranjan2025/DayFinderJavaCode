package com.dayfinder.main;

import java.util.Scanner;

public class DayFinder {
	public static void main(String[] args) {
		int retry;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter date of DOB");
			int date = sc.nextInt();
			System.out.println("Enter month of DOB");
			int month = sc.nextInt();
			while (month > 12) {
				System.out.println("Enter month of DOB");
				month = sc.nextInt();
			}
			System.out.println("Enter Year of DOB");
			int year = sc.nextInt();

			if (!isLeapYear(year)) {
				if (month == 2) {
					if (date == 29) {
						System.out.println("Please check date it cann't be 29 in non Leap Year");
						return;
					}
				}
			}

			int cyear = year - 1;
			// System.out.println(cyear);

			int upToYear = (cyear / 400) * 400;

			// System.out.println(upToYear);

			int NLY = cyear - upToYear;
			// System.out.println(NLY);
			int od = 0;

			// if leap year >=100 then find numbs of odd day by dividing 100

			int tem = NLY / 100;
			int tem2 = NLY % 100;
			switch (tem) {
				case 1:
					od = od + 5;
					break;
				case 2:
					od = od + 3;
					break;
				case 3:
					od = od + 1;
					break;
				default:
					break;
			}
			// System.out.println(od);
			int LY = (tem2 / 4);
			// System.out.println(LY);
			int NY = tem2 - LY;
			// System.out.println(NY);
			int OD = LY * 2 + NY + od;
			// System.out.println(OD);

			int sum = 0;
			int check = 0;
			if (isLeapYear(year)) {

				switch (month) {

					case 1:
						sum = date;
						if (date > 31) {
							System.out.println("January cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 2:
						sum = date + 3;
						if (date > 29) {
							System.out.println("Februryr cann't be greater than 29 ");
							check = 1;
						}
						break;
					case 3:
						sum = date + 3 + 1;
						if (date > 31) {
							System.out.println("March cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 4:
						sum = date + 6 + 1;
						if (date > 30) {
							System.out.println("April cann't be greater than 30 ");
							check = 1;
						}
						break;
					case 5:
						sum = date + 8 + 1;
						if (date > 31) {
							System.out.println("MAy cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 6:
						sum = date + 11 + 1;
						if (date > 30) {
							System.out.println("June cann't be greater than 30 ");
							check = 1;
						}
						break;
					case 7:
						sum = date + 13 + 1;
						if (date > 31) {
							System.out.println("July cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 8:
						sum = date + 16 + 1;
						if (date > 31) {
							System.out.println("August cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 9:
						sum = date + 19 + 1;
						if (date > 30) {
							System.out.println("September cann't be greater than 30 ");
							check = 1;
						}
						break;
					case 10:
						sum = date + 21 + 1;
						if (date > 31) {
							System.out.println("October cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 11:
						sum = date + 24 + 1;
						if (date > 30) {
							System.out.println("November cann't be greater than 30 ");
							check = 1;
						}
						break;
					case 12:
						sum = date + 26 + 1;
						if (date > 31) {
							System.out.println("December cann't be greater than 31 ");
							check = 1;
						}
						break;

				}
			} else {
				switch (month) {

					case 1:
						sum = date;
						if (date > 31) {
							System.out.println("January cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 2:
						sum = date + 3;
						if (date > 29) {
							System.out.println("Februryr cann't be greater than 29 ");
							check = 1;
						}
						break;
					case 3:
						sum = date + 3;
						if (date > 31) {
							System.out.println("March cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 4:
						sum = date + 6;
						if (date > 30) {
							System.out.println("April cann't be greater than 30 ");
							check = 1;
						}
						break;
					case 5:
						sum = date + 8;
						if (date > 31) {
							System.out.println("MAy cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 6:
						sum = date + 11;
						if (date > 30) {
							System.out.println("June cann't be greater than 30 ");
							check = 1;
						}
						break;
					case 7:
						sum = date + 13;
						if (date > 31) {
							System.out.println("July cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 8:
						sum = date + 16;
						if (date > 31) {
							System.out.println("August cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 9:
						sum = date + 19;
						if (date > 30) {
							System.out.println("September cann't be greater than 30 ");
							check = 1;
						}
						break;
					case 10:
						sum = date + 21;
						if (date > 31) {
							System.out.println("October cann't be greater than 31 ");
							check = 1;
						}
						break;
					case 11:
						sum = date + 24;
						if (date > 30) {
							System.out.println("November cann't be greater than 30 ");
							check = 1;
						}
						break;
					case 12:
						sum = date + 26;
						if (date > 31) {
							System.out.println("December cann't be greater than 31 ");
							check = 1;
						}
						break;

				}
			}

			// System.out.println(sum);

			int TotalOddDays = (sum + OD) % 7;

			String day = "";

			switch (TotalOddDays) {

				case 1:
					day = "MONDAY";
					break;
				case 2:
					day = "TUESDAY";
					break;

				case 3:
					day = "WEDNESDAY";
					break;
				case 4:
					day = "THRUSDAY";
					break;
				case 5:
					day = "FRIDAY";
					break;
				case 6:
					day = "SATURDAY";
					break;
				case 0:
					day = "SUNDAY";

			}
			if (check != 1) {
				System.out.println(day);
			}

			System.out.println("Do you want to continue press 1.Yes 2.No");
			retry = sc.nextInt();
		} while (retry == 1);

	}

	public static boolean isLeapYear(int year) {

		if (year % 4 == 0 || year % 400 == 0) {

			return true;

		}
		return false;

	}
}
