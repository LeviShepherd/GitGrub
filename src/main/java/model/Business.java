/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * May 6, 2021
 */
package model;

import java.util.List;
import java.util.PriorityQueue;

public class Business {
	
	private int id;
	private String name;
	private String address;
	private String phone;
	private PriorityQueue<Order> orders;
	private List<Item> menu;

	public Business() {
		super();
		
	}

	public Business(int id, String name, String address, String phone, PriorityQueue<Order> orders, List<Item> menu) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.orders = orders;
		this.menu = menu;
	}
	
	public Business(int id, String name, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public PriorityQueue<Order> getOrders() {
		return orders;
	}

	public void setOrders(PriorityQueue<Order> orders) {
		this.orders = orders;
	}

	public List<Item> getMenu() {
		return menu;
	}

	public void setMenu(List<Item> menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Business [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", orders="
				+ orders + ", menu=" + menu + "]";
	}
}
