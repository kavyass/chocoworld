package com.src.model;

public class OrderModel {

	private String name;
	private String address;
	private String phone_no;
	private String email;
	private String order_no;
	private String order_item;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getOrder_item() {
		return order_item;
	}
	public void setOrder_item(String order_item) {
		this.order_item = order_item;
	}

}
