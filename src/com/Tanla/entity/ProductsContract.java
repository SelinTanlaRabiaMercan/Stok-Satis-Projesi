package com.Tanla.entity;

import java.sql.Date;

public class ProductsContract {
	private int id;
	private String name;
	private int categoryId;
	private Date tarih;
	private float price;
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
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductsContract [id=" + id + ", name=" + name + ", categoryId=" + categoryId + ", tarih=" + tarih
				+ ", price=" + price + "]";
	}
	

	
}
