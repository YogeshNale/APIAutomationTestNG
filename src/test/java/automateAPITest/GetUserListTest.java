package automateAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.API.baseServices.GetUserList;
import com.API.serviceModules.GetUserResponseService;

import io.restassured.response.Response;

public class GetUserListTest {
	
	
	@Test
	public void getUserList() {
		GetUserList userList= new GetUserList();
		Response response=userList.getUserlist();
		GetUserResponseService getUserDetails=response.as(GetUserResponseService.class);
			System.out.println(response.asPrettyString());
		
		
	
		
	}

}
