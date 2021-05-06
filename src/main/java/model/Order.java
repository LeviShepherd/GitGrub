/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * May 6, 2021
 */
package model;

import java.util.LinkedList;

public class Order {

	private int id;
	private double amount;
	private Customer custId;
	private int busId;
	private LinkedList<Item> items;
	
	public Order() {
		super();
	}

	public Order(int busId) {
		super();
		this.busId = busId;
	}

	public Order(int id, double amount, Customer custId, int busId, LinkedList<Item> items) {
		super();
		this.id = id;
		this.amount = amount;
		this.custId = custId;
		this.busId = busId;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getCustId() {
		return custId;
	}

	public void setCustId(Customer custId) {
		this.custId = custId;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public LinkedList<Item> getItems() {
		return items;
	}

	public void setItems(LinkedList<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Business Id: " + busId + "\n" +  "Items: " + items + "\nTotal: $" + amount;
	}
}
