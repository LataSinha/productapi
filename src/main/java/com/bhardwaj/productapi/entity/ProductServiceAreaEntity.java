package com.bhardwaj.productapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductServiceAreaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String areaCode;
	int daysToDeliver;
	public ProductServiceAreaEntity() {
		super();
	}
	public ProductServiceAreaEntity(int id, String areaCode, int daysToDeliver) {
		super();
		this.id = id;
		this.areaCode = areaCode;
		this.daysToDeliver = daysToDeliver;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public int getDaysToDeliver() {
		return daysToDeliver;
	}
	public void setDaysToDeliver(int daysToDeliver) {
		this.daysToDeliver = daysToDeliver;
	}
	
}
