import io.restassured.RestAssured;
import static io.restassured.RestAssured.get;
import org.junit.Test;

public class ApiStatusTest {

    @Test public void shouldGetStatusCode200() {
        RestAssured.baseURI = "http://generator.swagger.io";
        get("/api/swagger.json").then().assertThat().statusCode(200);

    }

}