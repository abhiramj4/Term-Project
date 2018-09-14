package lab1;

import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<Buddyinfo> addresses;
	
	/**
	 * Constructor for addressbook
	 * set the addresses to null
	 */
	public AddressBook() {
		this.addresses = null;
	}
	
	/**
	 * Add a buddy to the addressbook
	 * @param buddy to add
	 */
	public void addBuddy(Buddyinfo buddy) {
		addresses.add(buddy);
	}
	
	/**
	 * Remove buddy from addresses
	 */
	public void removeBuddy() {
		addresses.remove(addresses.size()-1);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Address book");
		
	}
}
