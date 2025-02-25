package com.API.baseServices;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class BaseService {
	
	private static final String BASE_URL="https://reqres.in/";
	private static RequestSpecification requestSpecidication;
	
	public BaseService() {
		requestSpecidication = given().baseUri(BASE_URL);

	}
	
	protected Response getRequest(String Path) {
		Response GetRequest=requestSpecidication.get(Path);
		return GetRequest;
		
	}
	
	protected Response postRequest(Object payLoad,String path) {
		return requestSpecidication.body(payLoad).post(path);
	}
	
	protected Response putRequest(Object Payload ,String path) {
		return requestSpecidication.body(Payload).put(path);
	}

}
