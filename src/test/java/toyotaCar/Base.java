package toyotaCar;

import java.io.IOException;
import java.util.Map;

import utils.JsonUtils;

public class Base {

	public static Map<String, Object> dataFromJsonFile;

	static {
		String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
		try {
			dataFromJsonFile = JsonUtils.getJsonDataAsMap("buycar/" + env + "/toyotaApiData.json");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}