package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomepage 
{
	public WebDriver driver;
	By searchBox=By.cssSelector("#inp_search_box");
	
	
	public PortalHomepage(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	
	public WebElement getsearchBox()
	{
		return driver.findElement(searchBox);
	}


}
