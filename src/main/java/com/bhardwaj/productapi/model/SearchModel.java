package com.bhardwaj.productapi.model;

public class SearchModel {
	String productCode;
	String productName;
	String productBrand;
	public SearchModel() {
		super();
	}
	public SearchModel(String productCode, String productName, String productBrand) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productBrand = productBrand;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	
}
