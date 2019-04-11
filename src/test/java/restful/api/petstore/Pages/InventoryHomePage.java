package restful.api.petstore.Pages;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;



// TODO: Auto-generated Javadoc
/**
 * The Class InventoryHomePage.
 */
public class InventoryHomePage {
	
	/**
	 * Gets the response for pet store inventory.
	 *
	 * @param restAPIUrl the rest API url
	 * @return the response for pet store inventory
	 */
	public Response getResponseForPetStoreInventory(String restAPIUrl)
	{
		return 
		 given()
        .contentType(ContentType.JSON)
        .get(restAPIUrl)
        .then()
        .statusCode(200)
        .extract()
        .response();
		 
	}
	
	
	
	
	
}
