package utilities;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.junit.Before;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiBaseTest {

    protected RequestSpecification spec01;
    protected RequestSpecification spec02;
    protected RequestSpecification spec03;

    @Before
    public void setUp01() {

        //RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        //spec01 = requestSpecBuilder.  // This is also work.

        spec01 = new RequestSpecBuilder().
                setBaseUri("https://restful-booker.herokuapp.com").
                build();
    }
    @Before
    public void setUp02() {

        spec02 = new RequestSpecBuilder().
                setBaseUri("http://dummy.restapiexample.com/api/v1/employees").
                build();
    }


    @Before
    public void setUp03() {

        spec03 = new RequestSpecBuilder().
                setBaseUri("https://jsonplaceholder.typicode.com/todos").
                build();
    }
    protected Response createResponseForPost() {

        JSONObject jsonReqBody = new JSONObject();

        jsonReqBody.put("firstname","Refaz");
        jsonReqBody.put("lastname", "Tor");
        jsonReqBody.put("totalprice", "123");
        jsonReqBody.put("depositpaid", "true");

        JSONObject jsonBookingDatesBody = new JSONObject();

        jsonBookingDatesBody.put("checkin","2020-05-02");
        jsonBookingDatesBody.put("checkout","2020-05-05");

        jsonReqBody.put("bookingdates",jsonBookingDatesBody);
        jsonReqBody.put("additionalneeds","Wifi");

        Response response = given().
                contentType(ContentType.JSON). // "application/json"
                spec(spec01).
                auth().
                basic("admin","password123").
                body(jsonReqBody.toString()).
                when().
                post("/booking");

        return response;
    }

    protected Response createMapForRequestBody() {

        Map<Object, Object> requestMap = new HashMap<>();
        requestMap.put("firstname", "Suleyman");
        requestMap.put("lastname", "Alptekin");
        requestMap.put("totalprice", 123);
        requestMap.put("depositpaid", true);

        Map<Object, Object> bookingDatesMap = new HashMap<>();
        bookingDatesMap.put("checkin", "2020-05-02");
        bookingDatesMap.put("checkout", "2020-05-05");

        requestMap.put("bookingdates",bookingDatesMap);
        requestMap.put("additionalneeds", "Wifi");


        Response response = given().
                contentType(ContentType.JSON). // "application/json"
                spec(spec01).
                auth().
                basic("admin","password123").
                body(requestMap).
                when().
                post("/booking");

        return response;
    }
}