package day1;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

public class code {
	WebDriver driver;
	@Given("user open the chrome browser")
	public void user_open_the_chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.28\\Desktop\\san\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@And("user open TestMeApp")
	public void user_open_TestMeApp()
	{
		driver.get("http://10.232.237.143:443/TestMeApp");
		
	}
	@And("user click SingIn link")
	public void user_click_SingIn_link() {
		driver.findElement(By.linkText("SignIn")).click();
		driver.manage().window().maximize();
		
	}
	@And("user enter the username {string} and password {string}")
	public void user_enter_the_username_and_password(String c, String b)
	{
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(c);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(b);
	}
	@Then("user click the login button")
	public void user_click_login_button() {
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	}
	@And("user verify login and pageTitle")
	public void user_verify_login_and_pageTitle()
	{
		Assert.assertEquals("Home", driver.getTitle());
	}
	@Then("message login successfully")
	public void message_login_successfully()
	{
		System.out.println("Login successfully");
	}

}
