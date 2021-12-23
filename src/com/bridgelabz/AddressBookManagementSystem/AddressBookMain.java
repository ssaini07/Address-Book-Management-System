package com.bridgelabz.AddressBookManagementSystem;

public class AddressBookMain {

//Driver class
	public static void main(String[] args) {
		System.out.println("Welcome to the address book program");
		IPersonImplemenation contactImp = new IPersonImplemenation();
		System.out.println("Creation of a new contact");
		contactImp.addNewContact();
		
	}
}