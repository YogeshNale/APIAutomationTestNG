package com.API.baseServices;

import com.API.serviceModules.CreateUserRequestBuilder;
import com.API.serviceModules.UpdateUserdetailsRequest;

import io.restassured.response.Response;

public class CreateUser extends BaseService {

	private static final String BASE_PATH="api/users";
	
	public Response createUser(CreateUserRequestBuilder payLoad) {
		return postRequest(payLoad, BASE_PATH);
	}
	
	public Response updateUser(UpdateUserdetailsRequest payload) {
		return putRequest(payload,BASE_PATH+"/2");
	}
}
