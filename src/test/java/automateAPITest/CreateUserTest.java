package automateAPITest;

import org.testng.annotations.Test;

import com.API.baseServices.CreateUser;
import com.API.serviceModules.CreateUserRequestBuilder;
import com.API.serviceModules.CreateUserResponse;
import com.API.serviceModules.UpdateUserdetailsRequest;

import io.restassured.response.Response;

public class CreateUserTest {

	@Test
	public void createUser() {
		CreateUserRequestBuilder userCreate = new CreateUserRequestBuilder.Builder().name("Ashish").job("Developer")
				.Build();
		CreateUser createUser = new CreateUser();
		Response b = createUser.createUser(userCreate);
		CreateUserResponse createdUserresponse= b.as(CreateUserResponse.class);
		
	}
	
	@Test(priority=1)
	public void updateUser() {
		CreateUser createUser = new CreateUser();
		UpdateUserdetailsRequest updateDetails = new UpdateUserdetailsRequest();
		updateDetails.setName("Yogesh");
		updateDetails.setJob("Tester");
		Response a=createUser.updateUser(updateDetails);
		System.out.println(a.asPrettyString());
	}

}
