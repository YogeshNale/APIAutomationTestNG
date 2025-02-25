package com.API.serviceModules;

public class CreateUserResponse {
	private String id;
	
	private String createdAt;
	
	public CreateUserResponse() {
		
	}
	public CreateUserResponse(String id, String createdAt) {
		super();
		this.id = id;
		this.createdAt = createdAt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	
	

}
