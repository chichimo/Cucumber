package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase {
	
	WebDriver driver;
	
	@Given("^I have a firefox browser running$")
	public void i_have_a_firefox_browser_running()  {
		System.setProperty("webdriver.gecko.driver", "C://Users//hashi//Downloads//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		
	   
	}

	@When("^I go to the application$")
	public void i_go_to_the_application() {
		driver.get("http://opensource.demo.orangehrmlive.com");
	    
	}
	
	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password(DataTable data) {
	    
	List<List<String>>dataT=data.raw();
	driver.findElement(By.id("txtUsername")).sendKeys(dataT.get(0).get(0));
	driver.findElement(By.id("txtPassword")).sendKeys(dataT.get(0).get(1));
	}

	

	@When("^I click on the login button$")
	public void i_click_on_the_login_button()  {
		driver.findElement(By.name("Submit")).click();
	    
	}
	
	@Then("^I click on the Recruitment link$")
	public void i_click_on_the_Recruitment_link() {
		
		driver.findElement(By.linkText("Recruitment")).click();
	   
	}

	@Then("^I click on the Add Button$")
	public void i_click_on_the_Add_Button() {
		driver.findElement(By.name("btnAdd")).click();
	   
	}

	@Then("^I enter Full Name$")
	public void i_enter_Full_Name(DataTable data)  {
		List<List<String>>dataT=data.raw();
		driver.findElement(By.name("addCandidate[firstName]")).sendKeys(dataT.get(0).get(0));
		driver.findElement(By.name("addCandidate[middleName]")).sendKeys(dataT.get(0).get(1));
		driver.findElement(By.name("addCandidate[lastName]")).sendKeys(dataT.get(0).get(2));
	    
	}

	@Then("^I enter Email$")
	public void i_enter_Email(DataTable data) {
		List<List<String>>dataT=data.raw();
		driver.findElement(By.name("addCandidate[email]")).sendKeys(dataT.get(0).get(0));
	    
	}

	@Then("^I enter phone Number$")
	public void i_enter_phone_Number(DataTable phone) {
	    List<List<String>>dataphone = phone.raw();
	    driver.findElement(By.name("addCandidate[contactNo]")).sendKeys(dataphone.get(0).get(0));
	}

	
	
	
	@Then("^I should see the logout link$")
	public void i_should_see_the_logout_link() {
	    
	}
	
	
	@Given("^I have a firefox browser runningg$")
	public void i_have_a_firefox_browser_runningg() {
		System.setProperty("webdriver.gecko.driver", "C://Users//hashi//Downloads//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
	    
	}

	@When("^I go to the Application$")
	public void i_go_to_the_Application() {
		driver.get("http://opensource.demo.orangehrmlive.com");
	   
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String arg1, String arg2)  {
		
		driver.findElement(By.id("txtUsername")).sendKeys(arg1);
		driver.findElement(By.id("txtPassword")).sendKeys(arg1);
	    
	}


	
	
	
	
	
	
	
	
	
	
	
//	@Given("^I have a Chrome browser running$")
//	public void i_have_a_Chrome_browser_running()  {
//		System.setProperty("webdriver.chrome.driver", "C://Users//hashi//Downloads//Drivers//chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//	
//	@When("^I enter valid username as \"([^\"]*)\"$")
//	public void i_enter_valid_username_as(String arg1)  {
//	   driver.findElement(By.id("txtUsername")).sendKeys(arg1);
//	}
//
//	@When("^I enter valid password as \"([^\"]*)\"$")
//	public void i_enter_valid_password_as(String arg1)  {
//		driver.findElement(By.id("txtPassword")).sendKeys(arg1);
//	    
//	}
//	
	
	//Hook
	@Before() 
	public void runBrowser() {
		System.setProperty("webdriver.gecko.driver", "C://Users//hashi//Downloads//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@After()
	public void closeBrowser() {
		driver.quit();
	}




}
