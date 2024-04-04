package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
	public WebDriver driver;
	By signin=By.cssSelector("a[href*='login.cgi']");
	By title=By.cssSelector("a[href='https://realtime.rediff.com']");
	By popup=By.xpath("//i[@class='material-icons fc-close-icon']");
	
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public int getPopupSize()
	{
		return driver.findElements(popup).size();
	}
	public WebElement getPopup()
	{
		return driver.findElement(popup);
	}
	


}
