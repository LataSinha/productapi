package com.bhardwaj.productapi.dto;

public class LoggedUserSearchResponseDTO {
	int id;
	byte[] image;
	String name;
	String brand;
	double price;
	public LoggedUserSearchResponseDTO() {
		super();
	}
	public LoggedUserSearchResponseDTO(int id, byte[] image, String name, String brand, double price) {
		super();
		this.id = id;
		this.image = image;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
