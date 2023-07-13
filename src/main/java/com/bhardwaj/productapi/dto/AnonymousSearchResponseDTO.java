package com.bhardwaj.productapi.dto;

public class AnonymousSearchResponseDTO {
	int id;
	byte[] image;
	String name;
	String brand;
	public AnonymousSearchResponseDTO() {
		super();
	}
	public AnonymousSearchResponseDTO(byte[] image, String name, String brand, int id) {
		super();
		this.image = image;
		this.name = name;
		this.brand = brand;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
