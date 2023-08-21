package project.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCart extends PageObject{
    WebDriverWait wait;
    private final By add_button = By.id("add-to-cart-sauce-labs-backpack");
    private final By icon_cart = By.xpath("//div[@id='shopping_cart_container']/a");
    private final By remove_button = By.id("remove-sauce-labs-backpack");

    public ShoppingCart(WebDriver driver) {
        super(driver);
    }

    public void addToCart(){
        if(getDriver().findElement(add_button).isDisplayed()){
            click(add_button);
        } 
    }

    public void removeToCart() throws InterruptedException{
        if(getDriver().findElement(icon_cart).isDisplayed()){
            click(icon_cart);
            Thread.sleep(4);
            click(remove_button);
        } 
    }
}
