package com.Tanla.entity;

public class CustomerContract {
	private int id;
	private String firstname;
	private String lastname;
	private String address;
	private String cityid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	@Override
	public String toString() {
		return "CustomerContract [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address="
				+ address + ", cityid=" + cityid + "]";
	}
	
	
}
