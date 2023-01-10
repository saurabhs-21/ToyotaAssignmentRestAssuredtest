package toyotaCar;

import io.restassured.response.Response;
import utils.RestUtils;

public class BuyCarAPIs {

	public Response readBuyCar() {
		String endPoint = (String) Base.dataFromJsonFile.get("getBuyCarEndpoint");

		return RestUtils.performGet(endPoint);
	}
}
