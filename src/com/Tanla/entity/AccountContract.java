package com.Tanla.entity;

public class AccountContract {
	private int id;
	private int authorityid; //yetki
	private int employeeid;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAuthorityid() {
		return authorityid;
	}
	public void setAuthorityid(int authorityid) {
		this.authorityid = authorityid;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AccountContract [id=" + id + ", authorityid=" + authorityid + ", employeeid=" + employeeid
				+ ", password=" + password + "]";
	}
	
	

}
