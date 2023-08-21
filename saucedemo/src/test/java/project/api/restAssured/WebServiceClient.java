package project.api.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import project.classes.Utils;

public class WebServiceClient {

    public Response getDepartments() {
        Response response = RestAssured.get(Utils.URL_GET_DEP);
        return response;
    }

}
