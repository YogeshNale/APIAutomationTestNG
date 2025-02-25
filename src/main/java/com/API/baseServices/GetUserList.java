package com.API.baseServices;

import io.restassured.response.Response;

public class GetUserList extends BaseService {


	private String BASE_PATH="api/users?page=";
	
	public Response getUserlist() {
		return getRequest(BASE_PATH+"3333333");
	}
}
