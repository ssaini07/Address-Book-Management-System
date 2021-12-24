package com.bridgelabz.AddressBookManagementSystem;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

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

	@Override
	public void editContact() {

		String firstName = sc.next();
		System.out.println("Enter name you want to edit");
		Iterator<Person> iterator = list.listIterator();
		while (iterator.hasNext()) {

			person = iterator.next();
			if (firstName.equals(person.getFirstName())) {
				address = person.getAddress();
				System.out.println("enter the details of the person you want to edit");
				System.out.println("Choose fields you want to add");
				System.out.println(
						"1.First Name\t2.Last Name\t3.Email" + "\t4.Phone Number\t5.State\t6.City\t7.Zip\t8.Default");
				//int choice;
				//choice = sc.nextInt();
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter first name here");
					String fName = sc.next();
					person.setFirstName(fName);
					break;
				case 2:
					System.out.println("Enter last name");
					String lName = sc.next();
					person.setLastName(lName);
					break;
				case 3:
					System.out.println("Enter email");
					String emailAddress = sc.next();
					person.setEmail(emailAddress);
					break;
				case 4:
					System.out.println("Enter phone number");
					long phoneNum = sc.nextLong();
					person.setPhoneNumber(phoneNum);
					break;
				case 5:
					System.out.println("Enter state");
					String state = sc.next();
					address.setState(state);
					break;
				case 6:
					System.out.println("Enter city");
					String city = sc.next();
					address.setCity(city);
					break;
				case 7:
					System.out.println("Enter zip code");
					long zipCode = sc.nextLong();
					address.setZip(zipCode);
					break;
				default:
					System.out.println("Exit");
				}

			} else {
				System.out.println("person not found here");
			}

		}

	}

}

/*
 * for (int i = 0; i != information.size(); i++) { if
 * (information.get(i).getFirstName().matches(search)) {
 * System.out.println("found"); } }
 */