package com.Tanla.entity;

import java.sql.Date;

public class SalesContract {
	private int id;
	private int productid;
	private int employeeid;
	private int customerid;
	private int count;
	private Date tarih;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	@Override
	public String toString() {
		return "SalesContract [id=" + id + ", productid=" + productid + ", employeeid=" + employeeid + ", customerid="
				+ customerid + ", count=" + count + ", tarih=" + tarih + "]";
	}
	
	

}
