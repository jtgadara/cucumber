package stepdefination;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	public static WebDriver driver;

	@Given("^User Should be able to open the Browser$")
	public void this_is_my_first_step() throws Exception {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashiyana\\Downloads\\Compressed\\Jar\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}

	@When("^User Enters the Google Home page url$")
	public void this_is_my_second_step() throws Exception {
		driver.navigate().to("https://www.google.com/");
		//Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^User Enters Random Value on Search bar$")
	public void user_Enters_Random_Value_on_Search_bar() throws Exception {
		driver.findElement(By.id("lst-ib")).sendKeys("Test Google Search");
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^User press Enter$")
	public void user_Clicks_on_Google_Search_Button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	   
	}


	
	@Then("^Result should be displayed$")
	public void this_is_my_final_step() throws Exception {
		Thread.sleep(2000);
		String title = driver.getTitle();
		if(title.contains("Google Search"))
		{
		Assert.assertEquals("True", "True");
		}
		else
		{
			Assert.assertEquals("True", "False");
		}
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}



}
