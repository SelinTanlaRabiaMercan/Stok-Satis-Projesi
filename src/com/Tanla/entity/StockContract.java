package com.Tanla.entity;

import java.io.Console;
import java.sql.Date;

public class StockContract {
	private int id;
	private int employeeid;
	private int productid;
	private Date tarih;
	private int count;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		System.out.println("StockContract [id=" + id + ", employeeid=" + employeeid + ", productid=" + productid + ", tarih="
				+ tarih + ", count=" + count +  "]");
		return "StockContract [id=" + id + ", employeeid=" + employeeid + ", productid=" + productid + ", tarih="
				+ tarih + ", count=" + count +  "]";
	}
	
	
	
}
