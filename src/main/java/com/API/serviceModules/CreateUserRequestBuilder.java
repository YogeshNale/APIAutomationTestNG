package com.API.serviceModules;

public class CreateUserRequestBuilder {
	
	private String name;

	
	private String job;
	public CreateUserRequestBuilder(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String toString() {
		return "CreateUserRequestBuilder [name=" + name + ", job=" + job + "]";
	}

	public static class Builder{
		
		private String name;
		

		private String job;
		
		public Builder name(String name) {
			this.name=name;
			return this;
		}
		public Builder job(String job) {
			this.name=job;
			return this;
		}
		
		public CreateUserRequestBuilder Build() {
			CreateUserRequestBuilder createUser= new CreateUserRequestBuilder(name,job);
			return createUser;
		}
		
		
	}

}
