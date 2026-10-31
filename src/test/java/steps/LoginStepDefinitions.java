package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class LoginStepDefinitions {
    private WebDriver driver;
    private WebDriverWait wait;
    @Given("The regular user is in the login page")
    @Given("The regular user is in the login page of orangeHRM")
    public void the_regular_user_is_in_the_login_page_of_orange_hrm() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @When("The user enter valid credentials")
    public void the_user_enter_valid_credentials(io.cucumber.datatable.DataTable table) {
        Map<String,String> data = table.asMap(String.class,String.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.name("username")).sendKeys(data.get("username"));
        driver.findElement(By.name("password")).sendKeys(data.get("password"));
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    }
    @Then("The user will be redirected to the homepage")
    public void the_user_will_be_redirected_to_the_homepage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h6")));
        assertEquals(driver.findElement(By.tagName("h6")).getText(),"Dashboard",
                "You are not redirected to the homepage");
        driver.quit();
    }

}
