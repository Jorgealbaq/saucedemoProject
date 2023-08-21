package project.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project.classes.EnumDrivers;
import project.classes.LoginPage;
import project.classes.ShoppingCart;
import project.classes.Utils;

import java.io.IOException;

public class TestPageSuccess {
    WebDriverWait wait;
    private WebDriver driver;
    private LoginPage browser;
    private ShoppingCart addProduct;
    private ShoppingCart removeProduct;
    private String expected_url = "https://www.saucedemo.com/inventory.html";
    private final By error_text = By.xpath("//div[@class='error-message-container error']//h3[@data-test='error']");
    private final By remove_button = By.id("remove-sauce-labs-backpack");

    @BeforeMethod
    public void navigateToPage() {
        browser = new LoginPage(driver);
        // Choice the browser
        driver = browser.CreateMyDriver(EnumDrivers.CHROME);
        browser.visitTo(Utils.URL_SAUCEDEMO);
    }

    @Test(priority = 1, testName = "Blocked User login")
    public void lockedUser() {
        String messageError = "Epic sadface: Sorry, this user has been locked out.";
        browser.login("locked_out_user", "secret_sauce");
        Assert.assertEquals(driver.findElement(error_text).getText(), messageError);
    }

    @Test(priority = 2, testName = "Successful login and add product to cart")
    public void loginAndAddProduct() throws InterruptedException {
        String messageRemove = "Remove";
        browser.login("standard_user", "secret_sauce");
        Assert.assertEquals(driver.getCurrentUrl(), expected_url);
        Thread.sleep(4);
        addProduct = new ShoppingCart(driver);
        addProduct.addToCart();
        Assert.assertEquals(driver.findElement(remove_button).getText(), messageRemove);
    }

    @Test(priority = 3, testName = "Successful login and add/remove product to cart")
    public void loginAndRemoveProduct() throws InterruptedException {
        String messageRemove = "Remove";
        browser.login("standard_user", "secret_sauce");
        Assert.assertEquals(driver.getCurrentUrl(), expected_url);
        Thread.sleep(4);
        addProduct = new ShoppingCart(driver);
        addProduct.addToCart();
        Assert.assertEquals(driver.findElement(remove_button).getText(), messageRemove);
        removeProduct = new ShoppingCart(driver);
        removeProduct.removeToCart();
    }

    @AfterMethod
    public void afterMethod(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
            Utils.takingScreenshot(driver, result.getName());
        }
        driver.quit();
    }

}
