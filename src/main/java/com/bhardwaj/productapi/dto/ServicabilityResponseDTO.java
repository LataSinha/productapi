package com.bhardwaj.productapi.dto;

public class ServicabilityResponseDTO {
	private boolean status;
	private int inDays;
	public ServicabilityResponseDTO() {
		super();
	}
	public ServicabilityResponseDTO(boolean status, int inDays) {
		super();
		this.status = status;
		this.inDays = inDays;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getInDays() {
		return inDays;
	}
	public void setInDays(int inDays) {
		this.inDays = inDays;
	}
	
}
