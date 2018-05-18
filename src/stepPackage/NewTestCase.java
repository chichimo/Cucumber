package stepPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class NewTestCase {
	
	WebDriver driver;
	
	@Given("^I have Firefox browser running$")
	public void i_have_Firefox_browser_running()  {
		System.setProperty("webdriver.gecko.driver", "C://Users//hashi//Downloads//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		}
	
	
	@When("^I go to the website$")
	public void i_go_to_the_website()  {
		
		driver.get("http://www.freecrm.com");
	    
	}

	@When("^I enter a valid username as \"([^\"]*)\"$")
	public void i_enter_a_valid_username_as(String arg1)  {
		
		driver.findElement(By.name("username")).sendKeys(arg1);
	    
	}

	@When("^I enter a valid password as \"([^\"]*)\"$")
	public void i_enter_a_valid_password_as(String arg1) throws InterruptedException  {
		
		driver.findElement(By.name("password")).sendKeys(arg1);
		Thread.sleep(4000);
	    
	}

	@When("^I click on the login Button$")
	public void i_click_on_the_login_Button()  {
	   driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
	   
	}
	
	
	//AMAZON test case
	@When("^I go to the Website$")
	public void i_go_to_the_Website() {
		
	   driver.get("http://www.amazon.com");
		
	}

	@When("^verify the Account & Lists link is present$")
	public void verify_the_Account_Lists_link_is_present() {
		
		boolean link;
		try {
			driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]"));
			link=true;
		}catch (NoSuchElementException e) {
			link=false;
			
		}
	    
	}

	@When("^I hover on the link$")
	public void i_hover_on_the_link() throws InterruptedException {
		
		Actions act= new Actions (driver);
		WebElement link = driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]"));
		act.moveToElement(link).build().perform();
		Thread.sleep(3000);
	    
	}

	@When("^I click on the sign in button$")
	public void i_click_on_the_sign_in_button() {
		driver.findElement(By.xpath("//span[contains(.,'Sign in')]")).click();
	    
	}

	@When("^I enter invalid email as \"([^\"]*)\"$")	//Regex
	public void i_enter_invalid_email_as(String arg1)  {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(arg1);
	   
	}
	
	@When("^I enter invalid password as \"([^\"]*)\"$")
	public void i_enter_invalid_password_as(String arg1) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arg1);
		Thread.sleep(4000);
	    
	}
	
	@When("^I click on the sign in button in the form$")
	public void i_click_on_the_sign_in_button_in_the_form() {
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	  
	}


	@Then("^I should see the Error Message$")
	public void i_should_see_the_Error_Message() {
		
	 String actual = driver.findElement(By.xpath(".//*[@id='auth-warning-message-box']/div/h4")).getText();
	 String expected = "Important Message!";
	 Assert.assertEquals(expected, actual);
	 
	 System.out.println("PASSED!!!");
			 
	    
	}




}














@When("^I enter valid username$")
public void i_enter_valid_username()  {
	
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
    
}

@When("^I enter valid password$")
public void i_enter_valid_password()  {
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
    
}
