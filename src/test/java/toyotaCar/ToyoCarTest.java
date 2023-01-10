package toyotaCar;

import java.io.IOException;



import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class ToyoCarTest {

	

	@Test
	public void readBuyCar() throws IOException {
		Response response = new BuyCarAPIs().readBuyCar();
		System.out.print("status code " + response.getStatusCode());

		response.then().assertThat().statusCode(200).contentType(ContentType.JSON)
				.body("data.user_id", hasItems(4108, 4104, 4100, 4100, 4097, 4096, 4096, 4094, 4092, 4091))
				.body("data.title", hasItems());
}

}

  
