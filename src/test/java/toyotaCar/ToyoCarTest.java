package toyotaCar;

import java.io.IOException;

import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.contains;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ToyoCarTest {

	@Test
	public void readBuyCar() throws IOException {
		Response response = new BuyCarAPIs().readBuyCar();

		response.then().assertThat().statusCode(200).contentType(ContentType.JSON)
				.body("data.user_id", hasItems(3988, 3987, 3986, 3985, 3982, 3982, 3981, 3974, 3969, 3969))
				.body("data.title", contains(
						"Caput patior cognatus turba usque cogito consequatur tredecim accommodo ventito aufero culpa totam appono.",
						" Eos sustineo sunt vesco supplanto deorsum cultellus surculus ea apto qui pauper demum versus nostrum.",
						" Demulceo congregatio patria coepi fuga desino contigo clamo dolore aut.",
						" Claudeo tepidus recusandae curvus despirmatio et synagoga cruentus utroqueeos decerno cur ipsam odio terminatio voluptas vulgo adiuvo.",
						" Itaque sequi totus uter teres clarus thymum quis alienus beneficium pariatur terror.",
						" Adsum vito amor thymbra vociferor culpa cinis adaugeo vir una.",
						" Aloapprobo cunae magnam deinde temporibus curtus.",
						" Thymbra aqua adimpleo varietas sulum thymum tabgo subiungo contigo cubo aggero.",
						" Baiulus deinde cubicularis accusamus dolor vacuus vivo defigo vobis comis sub cognomen ago crebro cultura summa cattus acceptus turba.",
						" Vigilo aperio usitas cauda cresco non suscipiouredo caveo ver volutabrum expedita asporto eos dolor et."));
	}

}
