package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameLocator  = By.id("user-name");
    private By passwordLocator  = By.id("password");
    private By loginButton  = By.id("login-button");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void openLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }
    public void setUserName(String username){
        driver.findElement(usernameLocator).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordLocator).sendKeys(password);
    }
    public HomePage clickLogin(){
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }


}
