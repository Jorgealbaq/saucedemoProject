package project.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PageObject {
    private WebDriver driver;
    // setProperty for Chrome
    private String driverChrome = "webdriver.chrome.driver";
    private String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
    // setProperty for Firefox
    private String driverFirefox = "webdriver.gecko.driver";
    private String firefoxPath = System.getProperty("user.dir") + "\\drivers\\geckodriver.exe";

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver CreateMyDriver(EnumDrivers myDriver) {
        switch (myDriver) {
            case CHROME:
                setProperty(driverChrome, chromePath);
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                return driver;
            case FIREFOX:
                setProperty(driverFirefox, firefoxPath);
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                return driver;
            case SAFARI:
                driver = new SafariDriver();
                driver.manage().window().maximize();
                return driver;

            default:
                throw new IllegalArgumentException("Driver provide is not implemented.");
        }
    }

    public void setProperty(String webDriver, String path) {
        System.setProperty(webDriver, path);
    }

    public WebElement findElement(By locator) {
        return getDriver().findElement(locator);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public void type(String inputText, By locator) {
        getDriver().findElement(locator).sendKeys(inputText);
    }

    public void visitTo(String url) {
        getDriver().get(url);
    }

}
