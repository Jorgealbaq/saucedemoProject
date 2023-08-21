package project.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project.classes.EnumDrivers;
import project.classes.LoginPage;
import project.classes.Utils;

import java.io.IOException;

public class TestPageFailed {

    private WebDriver driver;
    private LoginPage browser;
    private String expected_url = "https://www.saucedemo.com/inventory.html";
    private final By error_text = By.xpath("//div[@class='error-message-container error']//h3[@data-test='error']");

    @BeforeMethod
    public void navigateToPage() {
        browser = new LoginPage(driver);
        driver = browser.CreateMyDriver(EnumDrivers.CHROME);
        browser.visitTo(Utils.URL_SAUCEDEMO);
    }

    @Test(priority = 1, testName = "Failed login")
    public void failedLogin() {
        browser.login("standard_user", "secret_sauce");
        Assert.assertEquals(driver.getCurrentUrl(), expected_url);
        Assert.fail("Este caso de prueba está diseñado para fallar");
    }

    @Test(priority = 2, testName = "Failed Blocked user login")
    public void failedlockedUser() {
        String messageError = "Epic sadface: Sorry, this user has been locked out.";
        browser.login("locked_out_user", "secret_sauce1");
        Assert.assertEquals(driver.findElement(error_text).getText(), messageError);
    }

    @AfterMethod
    public void afterMethod(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
            Utils.takingScreenshot(driver, result.getName());
        }
        driver.quit();
    }
}
