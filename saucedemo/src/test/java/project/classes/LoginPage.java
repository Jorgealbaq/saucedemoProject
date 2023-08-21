package project.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageObject{
    private final By username_box = By.id("user-name");
    private final By password_box = By.id("password");
    private final By login_button = By.id("login-button");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void login(String username, String password){        
        type(username, username_box);
        type(password, password_box);
        click(login_button); 
    }

}
