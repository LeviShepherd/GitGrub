/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * May 6, 2021
 */
package controller;

import java.util.ArrayList;
import java.util.List;

import model.Item;

public class ItemHelper {
	
	public List<Item> getItems(int id){
		List<Item> allItems = new ArrayList<>();
		
		switch(id) {
		case 1:		//Victory Lane
			Item a1 = new Item("Cheeseburger", 4.99);
			Item a2 = new Item("Fries", 1.99);
			Item a3 = new Item("Onion Rings", 2.99);
			Item a4 = new Item("Tenderloin", 5.99);
			Item a5 = new Item("Cheeseballs", 3.99);
			Item a6 = new Item("Swiss Burger", 5.99);
			Item a7 = new Item("Dbl Cheeseburger", 6.99);
			Item a8 = new Item("Pizza", 8.99);
			allItems.add(a1);
			allItems.add(a2);
			allItems.add(a3);
			allItems.add(a4);
			allItems.add(a5);
			allItems.add(a6);
			allItems.add(a7);
			allItems.add(a8);
			break;
		case 2:		//Now Or Later
			Item b1 = new Item("Spaghetti", 5.35);
			Item b2 = new Item("Chicken Alfredo", 8.99);
			Item b3 = new Item("Tortellini", 7.50);
			Item b4 = new Item("Garden Salad", 4.75);
			Item b5 = new Item("Chicken Salad", 6.25);
			Item b6 = new Item("Breadsticks", 2.99);
			Item b7 = new Item("Onion Soup", 4.50);
			Item b8 = new Item("Tomato Soup", 3.99);
			allItems.add(b1);
			allItems.add(b2);
			allItems.add(b3);
			allItems.add(b4);
			allItems.add(b5);
			allItems.add(b6);
			allItems.add(b7);
			allItems.add(b8);
			break;
		case 3:		// Tequila Cantina
			Item c1 = new Item("Chicken Taco", 3.00);
			Item c2 = new Item("Beef Taco", 2.75);
			Item c3 = new Item("Shrimp Taco", 4.50);
			Item c4 = new Item("Steak Taco", 5.00);
			Item c5 = new Item("Combination Fajita", 8.99);
			Item c6 = new Item("Beef Fajita", 6.99);
			Item c7 = new Item("Chimichanga", 3.50);
			Item c8 = new Item("Taco Salad", 5.75);
			allItems.add(c1);
			allItems.add(c2);
			allItems.add(c3);
			allItems.add(c4);
			allItems.add(c5);
			allItems.add(c6);
			allItems.add(c7);
			allItems.add(c8);
			break;
		case 4:		//East Side Eddies
			Item d1 = new Item("Hamburger", 5.99);
			Item d2 = new Item("Fries", 2.50);
			Item d3 = new Item("Onion Rings", 3.75);
			Item d4 = new Item("Tenderloin", 6.25);
			Item d5 = new Item("Cheeseballs", 2.75);
			Item d6 = new Item("Swiss Burger", 6.25);
			Item d7 = new Item("Dbl Cheeseburger", 7.99);
			Item d8 = new Item("Pizza", 9.99);
			allItems.add(d1);
			allItems.add(d2);
			allItems.add(d3);
			allItems.add(d4);
			allItems.add(d5);
			allItems.add(d6);
			allItems.add(d7);
			allItems.add(d8);
			break;
		case 5:		//Champs Chicken
			Item e1 = new Item("Buffalo Wings", 9.99);
			Item e2 = new Item("BBQ Drumsticks", 6.50);
			Item e3 = new Item("Breaded Sandwich", 5.00);
			Item e4 = new Item("Chicken Stick", 3.50);
			Item e5 = new Item("Bucket of Chicken", 19.99);
			Item e6 = new Item("5pc Chicken", 6.50);
			Item e7 = new Item("10pc Chicken", 9.99);
			Item e8 = new Item("Mac n Cheese", 3.50);
			allItems.add(e1);
			allItems.add(e2);
			allItems.add(e3);
			allItems.add(e4);
			allItems.add(e5);
			allItems.add(e6);
			allItems.add(e7);
			allItems.add(e8);
			break;
		case 6:		//Pueblo Viejo
			Item f1 = new Item("Fish Taco", 4.00);
			Item f2 = new Item("Beef Taco", 3.75);
			Item f3 = new Item("Shrimp Taco", 5.50);
			Item f4 = new Item("Steak Taco", 6.00);
			Item f5 = new Item("Combination Fajita", 9.99);
			Item f6 = new Item("Beef Fajita", 7.99);
			Item f7 = new Item("Chimichanga", 4.50);
			Item f8 = new Item("Taco Salad", 6.75);
			allItems.add(f1);
			allItems.add(f2);
			allItems.add(f3);
			allItems.add(f4);
			allItems.add(f5);
			allItems.add(f6);
			allItems.add(f7);
			allItems.add(f8);
			break;
		}
		
		return allItems;
	}
}
