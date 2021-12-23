package com.bridgelabz.AddressBookManagementSystem;

import java.util.Scanner;

public class AddressBookMain {
	static String firstName, lastName, email, state, city, address;
	static long zip, phoneNumber;

//Here creating input method.
	public void getInput() {
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your first name");
			firstName = sc.next();
			System.out.println("Enter your last name");
			lastName = sc.next();
			System.out.println("Enter your email");
			email = sc.next();
			System.out.println("Enter your city");
			city = sc.next();
			System.out.println("Enter your state");
			state = sc.next();
			System.out.println("Enter your address");
			address = sc.next();
			System.out.println("Enter your zip code");
			zip = sc.nextLong();
			System.out.println("Enter your phone number");
			phoneNumber = sc.nextLong();

		}
	}

//Driver class
	public static void main(String[] args) {
		System.out.println("Welcome to the address book program");
		AddressBookMain addressBook = new AddressBookMain();
		addressBook.getInput();
		System.out.println("first name is :" + firstName);
		System.out.println("last name is :" + lastName);
		System.out.println("email is :" + email);
		System.out.println("city is :" + city);
		System.out.println("state is :" + state);
		System.out.println("address is :" + address);
		System.out.println("zip code is :" + zip);
		System.out.println("phone number is :" + phoneNumber);
	}

}
