package project.tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.api.restAssured.WebServiceClient;

public class TestApiGet {
    @Test
    public void testDepartmentsInMercadoLibreService() {
        WebServiceClient webServiceClient = new WebServiceClient();
        Response response = webServiceClient.getDepartments();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.getBody().asString().contains("departments"));

    }
}
