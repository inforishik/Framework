package stepdefenition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.PortalHomepage;
import resources.base;

import org.junit.runner.RunWith;
import org.testng.Assert;

@RunWith(Cucumber.class)
public class StepDefenition extends base{

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click to Login link in home page to land on Secure sign in Page$")
	public void click_to_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		if(l.getPopupSize()>0)
		{
			l.getPopup().click();
		}
	}

	@Then("^Verify  that is successfully logged in$")
	public void verify_that_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PortalHomepage p=new PortalHomepage(driver);
	    Assert.assertTrue(p.getsearchBox().isDisplayed());
	}
	

	    @When("^User enters (.+) and (.+) logs in$")
	    public void user_enters_mailmerishi_and_Pankaj_logs_in(String username, String password) throws Throwable {
	    	LoginPage lp=new LoginPage(driver);
			lp.getEmail().sendKeys(username);
			lp.getPassword().sendKeys(password);
			lp.getLogin().click();
	    }
	    @And("^Close  browsers$")
	    public void close_browsers() throws Throwable {
	        driver.quit();
	    }

	
	}
	   
	



