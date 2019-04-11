package restful.api.petstore.Pages;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import restful.api.petstore.initialsetup.CommonUtils;

import static io.restassured.RestAssured.given;

import java.util.Properties;


// TODO: Auto-generated Javadoc
/**
 * The Class PetStoreHomePage.
 */
public class PetDetailsHomePage {

	
	/** The prop data. */
	Properties propData = CommonUtils.getValFromData();
	
	
	/**
	 * Post request for pet store.
	 *
	 * @param restAPIUrl the rest API url
	 * @return the response
	 */
	
	public Response postRequestForPetStore(String restAPIUrl)
	{
		String POST_PARAMS= CommonUtils.getPropertiesValue("petdetails", propData);
//		String petName= CommonUtils.getPropertiesValue("name", propData);
//		String petPhotoUrls= CommonUtils.getPropertiesValue("photoUrls", propData);
//		
//		//Creating dynamic string
//		final String POST_PARAMS  = "{ \"id\": "+petId+", \"category\": "+
//		"{ \"id\": "+petId+", \"name\": \"string\" }"
//		+ ", \"name\": \""+petName+"\", \"photoUrls\": [ \""+petPhotoUrls+"\" ]}";
		
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
	
	public Response getResponseForPetStoreInventory(String restAPIUrl)
	{
		String petId= CommonUtils.getPropertiesValue("petid", propData);
		
		return 
		 given()
        .contentType(ContentType.JSON)
        .get(restAPIUrl+"/"+petId)
        .then()
        .statusCode(200)
        .extract()
        .response();
		 
	}
	
	
	
	
	
}
