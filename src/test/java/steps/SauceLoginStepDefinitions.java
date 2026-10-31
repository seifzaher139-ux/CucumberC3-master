package steps;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverFactory;

import static org.testng.Assert.assertEquals;

public class SauceLoginStepDefinitions {
    LoginPage loginPage=new LoginPage(DriverFactory.getWebDriver());
    HomePage homePage;
    @Given("I am on the login Page")
    public void i_am_on_the_login_page() {
        loginPage.openLoginPage();
    }
    @When("The Standard User Enters Valid Username And Password")
    public void the_standard_user_enters_valid_username_and_password() {
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
    }
    @When("Clicks Login Button")
    public void clicks_login_button() {
        homePage=loginPage.clickLogin();
    }
    @Then("The user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        assertEquals(homePage.getProductText(),"Products",
                "You haven't logged in");
    }
}
