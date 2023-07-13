package com.bhardwaj.productapi.dto;

public class AuthResponseDTO {
    private String accessToken;
    private String tokenType = "Bearer ";
    private String userEmail;

    public AuthResponseDTO(String accessToken, String userEmail) {
        this.accessToken = accessToken;
        this.userEmail=userEmail;
    }

	public AuthResponseDTO() {
		super();
	}

	public AuthResponseDTO(String accessToken, String tokenType, String userEmail) {
		super();
		this.accessToken = accessToken;
		this.tokenType = tokenType;
		this.userEmail=userEmail;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
    
}
