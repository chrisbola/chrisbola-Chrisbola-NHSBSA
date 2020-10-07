package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
static WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		BasePage.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public static String getPageTitle() 
	{
		return driver.getTitle();
	}
	
	public static boolean isTextDisplayed(String text) {
		
		return driver.getPageSource().contains(text);
		
	}
	
	public static void closeBrowser() {
		
		driver.close();
		driver.quit();
	}

}
