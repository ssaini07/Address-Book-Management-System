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
	String firstName;

	@Override
	public void deletePerson() {
		System.out.println("Enter name you want to delete");
		firstName = sc.next();
		Iterator<Person> iterator = list.listIterator();
		while (iterator.hasNext()) {

			person = iterator.next();

			if (firstName.equals(person.getFirstName())) {

				list.remove(person);
				System.out.println("Contact has been deleted successfully");
			}
		}

	}

}