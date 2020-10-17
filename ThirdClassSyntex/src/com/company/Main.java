package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number between 1-7");
        int number = scanner.nextInt();
        scanner.close();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

//        String language;
//
//        switch (country.toLowerCase()) {
//            case "turkey":
//                language = "Turkish";
//                break;
//
//            case "england":
//
//            case "usa":
//                language = "English";
//                break;
//
//            case "russia":
//                language = "Russian";
//                break;
//
//            case "france":
//                language = "French";
//                break;
//
//            default:
//                System.out.println("Please enter a country");
//                return;
//        }
//
//        System.out.println("The official language that you entered " + country + " is " + language);
//    }

//Write a program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)

//    	Scanner scanner = new Scanner(System.in);
//		System.out.println("Hello, please enter your name");
//		String name = scanner.nextLine();
//
//		System.out.println("Your name is " + name);

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Please enter some type of text = ");
//		String value = scanner.nextLine();
//
//		System.out.println("Finally I understood " + value);

//		System.out.println("Please enter your name: ");
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.nextLine();
//		System.out.println("My name is " + name);

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Is your name Mahmut ");
//
//		Boolean name = scanner.nextBoolean();
//
//		if (name) {
//			System.out.println("Your name is Mahmut");
//		} else {
//			System.out.println("Your name is not Mahmut");
//		}
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please Enter First Name");
//		String name = scanner.nextLine();
//
//		System.out.println("Please Enter Surname");
//		String surname = scanner.nextLine();
//
//		System.out.println(name + " " + surname);

//    	double myNewDoubleValue = (int) 100.50;
//		System.out.println(myNewDoubleValue);


//		int month = 3;
//
//		if (month == 1) {
//			System.out.println("It is January");
//		} else if (month == 2) {
//			System.out.println("It is February");
//		} else if (month == 3) {
//			System.out.println("It is March");
//		} else if (month == 4) {
//			System.out.println("It is April");
//		} else if (month == 5) {
//			System.out.println("It is May");
//		} else if (month == 6) {
//			System.out.println("It is June");
//		} else if (month == 7) {
//			System.out.println("It is July");
//		} else if (month == 8) {
//			System.out.println("It is August");
//		} else if (month == 9) {
//			System.out.println("It is September");
//		} else if (month == 10) {
//			System.out.println("It is October");
//		} else if (month == 11) {
//			System.out.println("It is November");
//		} else if (month == 12) {
//			System.out.println("It is December");
//		} else {
//			System.out.println("Please check you number. It should be between 1 to 12");
//		}
//
//
//		int number = 1;
//
//		if (number < 0) {
//			System.out.println("The number " + number + " is negative");
//		} else {
//			System.out.println("The number " + number + " is positive");
//		}
//
//
//		int number2 = 3;
//
//		if (number2 % 2 == 0) {
//			System.out.println("The number " + number + " is even");
//		} else {
//			System.out.println("The number " + number + " is odd");
//		}
//
//
//		boolean assignment = true;
//		int score = 80;
//
//		if (assignment) {
//			System.out.println("Thanks for completed the assignment");
//
//			if (score >= 90) {
//				System.out.println("great job");
//			} else if (score >= 80) {
//				System.out.println("good job");
//			} else if (score >= 70) {
//				System.out.println("you passed");
//			} else if (score < 70) {
//				System.out.println("study more");
//			}
//		} else {
//			System.out.println("Waiting for completion of assignment");
//		}
//
//
//		boolean diploma = true;
//		int gpaScore = 0;
//
//		if (diploma) {
//			System.out.println("Congratulations");
//			if (gpaScore >= 3.5) {
//				System.out.println("You are eligible for scholarship");
//			}else {
//				System.out.println("You should have studied harder");
//			}
//		} else {
//			System.out.println("You should get degree");
//		}
//
//
//		int mortgageRate = 0;
//		int mortgagePrice = 0;
//
//		if (mortgageRate > 4.5) {
//			System.out.println("You shouldn't buy a house");
//		} else {
//			System.out.println("It is considerable to buy a house");
//			if (mortgagePrice < 200000) {
//				System.out.println("You need mortgage");
//			} else {
//				System.out.println("You can buy in cash");
//			}
//		}


	}
