package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	
	  public WebDriver driver;
	  
	  @BeforeMethod
	
	   public void intilizeBrowser()
	   {
		   
		   driver = new ChromeDriver();
		   driver.get("https://groceryapp.uniqassosiates.com/admin");
		   driver.manage().window().maximize();
	   }

}
