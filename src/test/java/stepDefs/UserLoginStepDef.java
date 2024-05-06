package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}
	@When("User enters cred")
	public void user_enters_cred() {
		
	      driver.findElement(By.id("username")).sendKeys("tomsmith");
	      driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	      driver.findElement(By.className("radius")).click();
	}
	@Then("User logged in")
	public void user_logged_in() {
	   boolean isDis = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	   Assert.assertTrue(isDis);
	   driver.close();
	}
}
