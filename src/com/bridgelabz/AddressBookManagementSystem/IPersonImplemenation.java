package com.bridgelabz.AddressBookManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPersonImplemenation implements IPerson {
	Scanner sc = new Scanner(System.in);
	ArrayList<Person> list = new ArrayList<Person>();
	Person person = new Person();
	Address address = new Address();
	

	@Override
	public void addNewContact() {

		System.out.println("Enter your first name");
		String firstName = sc.next();
		person.setFirstName(firstName);
		System.out.println("Enter your last name");
		String lastName = sc.next();
		person.setLastName(lastName);
		System.out.println("Enter your email address");
		String email = sc.next();
		person.setEmail(email);
		System.out.println("Enter phone number");
		long phoneNumber = sc.nextLong();
		person.setPhoneNumber(phoneNumber);

		System.out.println("Enter state");
		String state = sc.next();
		address.setState(state);

		System.out.println("Enter city");
		String city = sc.next();
		address.setCity(city);

		System.out.println("Enter zip");
		long zip = sc.nextInt();
		address.setZip(zip);

		System.out.println("Contact added details are:");
		person.setAddress(address);
		list.add(person);
		
		System.out.println("New added contact Details are:");
		System.out.println("FirstName:" + person.getFirstName() + " " + "LastName:" + person.getLastName() + " "
				+ "Email:" + person.getEmail() + " " + "PhoneNumber:" + person.getPhoneNumber() + " " + "Address:"
				+ person.getAddress() + " " + address.getState() + " , " + address.getCity() + " , "
				+ address.getZip());

	}


	

}
