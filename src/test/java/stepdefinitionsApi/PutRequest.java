package stepdefinitionsApi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import utilities.ApiBaseTest;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PutRequest extends ApiBaseTest {

    Map<Object, Object> jsonReqBody = new HashMap<>();//i could use map
    Response response = given().
            //spec(spec03).
            when().
            get("https://jsonplaceholder.typicode.com/todos/10");

    @Given("Change the 10th id information")
    public void change_the_10th_id_information() {

        //do not need to enter data for all keys you just change one info



    }

    @Given("change the id number to {int}")
    public void change_the_id_number_to(Integer int1) {
        jsonReqBody.put("userId", 27);
    }

    @Given("title to {string}")
    public void title_to(String string) {
        jsonReqBody.put("title", "Sdet");
    }

    @Given("Completed to false")
    public void completed_to_false() {
        jsonReqBody.put("completed", false);
    }

    @Then("verify that all changes were applied")
    public void verify_that_all_changes_were_applied() {
        Response responseForPut = given().
                contentType(ContentType.JSON).
                //spec(spec03).
                body(jsonReqBody).
                when().
                put("https://jsonplaceholder.typicode.com/todos/10");
        responseForPut.prettyPrint();
        response.prettyPrint();

        responseForPut.then().assertThat().statusCode(200);
        JsonPath json = responseForPut.jsonPath();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(json.getInt("userId"), 27 );
        softAssert.assertEquals(json.getBoolean("completed"), false);
        softAssert.assertEquals(json.get("title"), "Sdet");
        softAssert.assertAll();
    }

}
