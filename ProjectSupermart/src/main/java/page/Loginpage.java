package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	
	   @FindBy(xpath="//input[@name='username']") WebElement Usernamelogin;
	   @FindBy(xpath="//input[@name='password']") WebElement Passwordlogin;
	   @FindBy(xpath="//button[@class='btn btn-dark btn-block']") WebElement LoginButtonclick;
	   
	   public WebDriver driver;
	   
	     public Loginpage(WebDriver driver)
	     {
	    	 this.driver=driver;
	    	 PageFactory.initElements(driver, this);
	     }
	     
	     
	     public void loginUsername(String Username)
	     {
	    	 Usernamelogin.sendKeys(Username);
	     }
	     
	     public void loginPassword(String Password)
	     {
	    	 Passwordlogin.sendKeys(Password);
	     }
	     
	     public void loginButtonClick()
	     {
	    	 LoginButtonclick.click();
	     }
	  

}
