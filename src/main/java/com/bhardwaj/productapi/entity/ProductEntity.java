package com.bhardwaj.productapi.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productId;
	String productCode;
	String productName;
	String productBrand;
	double productPrice;
	@Column(length = 100000)
	String productDescription;
	@Lob
	@Column(length = 100000)
	byte productImage[];
	@ManyToMany
	List<ProductServiceAreaEntity> productServiceAreas;
	public ProductEntity() {
		super();
	}
	public ProductEntity(int productId, String productCode, String productName, String productBrand, double productPrice,
			String productDescription, byte[] productImage, List<ProductServiceAreaEntity> productServiceAreas) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.productImage = productImage;
		this.productServiceAreas = productServiceAreas;
	}
	public ProductEntity(String productCode, String productName, String productBrand, double productPrice,
			String productDescription, byte[] productImage, List<ProductServiceAreaEntity> productServiceAreas) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.productImage = productImage;
		this.productServiceAreas = productServiceAreas;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public byte[] getProductImage() {
		return productImage;
	}
	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}
	public List<ProductServiceAreaEntity> getProductServiceAreas() {
		return productServiceAreas;
	}
	public void setServicability(List<ProductServiceAreaEntity> productServiceAreas) {
		this.productServiceAreas = productServiceAreas;
	}
	
	
	
}
