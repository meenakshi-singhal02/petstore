package restful.api.petstore.Pages;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import restful.api.petstore.initialsetup.CommonUtils;

import static io.restassured.RestAssured.given;

import java.util.Properties;


// TODO: Auto-generated Javadoc
/**
 * The Class UserHomePage.
 */
public class UserDetailsHomePage {

	
	/** The prop data. */
	Properties propData = CommonUtils.getValFromData();
	
	
	/**
	 * Post request for pet store.
	 *
	 * @param restAPIUrl the rest API url
	 * @return the response
	 */
	
	public Response postRequestForUserDetails(String restAPIUrl)
	{
		String POST_PARAMS= CommonUtils.getPropertiesValue("userDetails", propData);
		
		return 
		 given()
        .contentType(ContentType.JSON)
        .body(POST_PARAMS)
        .post(restAPIUrl)
        .then()
        .statusCode(200)
        .extract()
        .response();
		 
	}	
	
	
}
