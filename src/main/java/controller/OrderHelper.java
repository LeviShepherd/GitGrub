/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * May 6, 2021
 */
package controller;

import model.Item;

public class OrderHelper {
	
	public double getItemTotal(Item i, int qty) {
		double price = (double) i.getPrice();
		int quantity = qty;
		return price * quantity;
	}
}
