import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Step;
import io.qameta.allure.junit5.DisplayName;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@Epic("Petstore API Testing")
@Feature("Pets")
public class PetstoreApiTest {

    @Before
    public void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }

    @Test
    @Story("Get Pet Information")
    @DisplayName("Get Pet Information Test")
    public void getPetInformationTest() {
        Response response = given()
                .when()
                .get("/pet/1")
                .then()
                .statusCode(200)
                .extract()
                .response();

        validatePetInformation(response);
    }

    @Step("Validate Pet Information")
    private void validatePetInformation(Response response) {
        response.then()
                .body("id", equalTo(1))
                .body("name", equalTo("doggie"))
                .body("status", equalTo("available"));
    }
}
