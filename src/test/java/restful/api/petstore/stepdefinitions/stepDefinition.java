package restful.api.petstore.stepdefinitions;

import java.util.Properties;

import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import restful.api.petstore.Pages.InventoryHomePage;
import restful.api.petstore.Pages.PetDetailsHomePage;
import restful.api.petstore.Pages.UserDetailsHomePage;
import restful.api.petstore.initialsetup.CommonUtils;

/**
 * The Class stepDefinition.
 */
public class stepDefinition {

	
	public static Properties propConfig = CommonUtils.getValFromResource();
	
	@Given("^I navigate API to \"([^\"]*)\" and successfully added new pet$")
	public void i_navigate_API_to_and_successfully_added_new_pet(String arg1) throws Throwable {	
		String baseURL= CommonUtils.getPropertiesValue(arg1, propConfig);	
		PetDetailsHomePage objDealerHomePage = new PetDetailsHomePage();
		Response res = objDealerHomePage.postRequestForPetStore(baseURL);
		System.out.println(res.body().asString());		
		}
	
	@Given("^I navigate API to \"([^\"]*)\" and should able to see pet details$")
	public void i_navigate_API_to_and_should_able_to_see_pet_details(String arg1) throws Throwable {
		String baseURL= CommonUtils.getPropertiesValue(arg1, propConfig);
		PetDetailsHomePage objDealerHomePage = new PetDetailsHomePage();
		Response res = objDealerHomePage.getResponseForPetStoreInventory(baseURL);
		System.out.println(res.body().asString());
	}

	@Given("^I navigate API to \"([^\"]*)\" and successfully able to fetch all pet details$")
	public void i_navigate_API_to_and_successfully_able_to_fetch_all_pet_details(String arg1) throws Throwable { 
		String baseURL= CommonUtils.getPropertiesValue(arg1, propConfig);	
		InventoryHomePage objInventoryHomePage = new InventoryHomePage();
		Response res = objInventoryHomePage.getResponseForPetStoreInventory(baseURL);
		System.out.println(res.body().asString());
	}

	@Given("^I navigate API to \"([^\"]*)\" and successfully able to see user information$")
	public void i_navigate_API_to_and_successfully_able_to_see_user_information(String arg1) throws Throwable {
		String baseURL= CommonUtils.getPropertiesValue(arg1, propConfig);	
		UserDetailsHomePage objUserDetailsHomePage = new UserDetailsHomePage();
		Response res = objUserDetailsHomePage.postRequestForUserDetails(baseURL);
		System.out.println(res.body().asString());		
		}
	

}
