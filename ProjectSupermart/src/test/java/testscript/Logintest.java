package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import page.Excelutility;
import page.Loginpage;

public class Logintest extends Base {

	@Test
	   public void verifyThatTheUserSholudAbleToLoginWithValidCredatioals() throws IOException
	   {
		
		    String Username= Excelutility.getStringData(1, 0, "Loginuser");
		    String Password= Excelutility.getStringData(1, 1, "Loginuser");
		    
		    Loginpage logingpage= new Loginpage(driver);
		    logingpage.loginUsername(Username);
		    logingpage.loginPassword(Password);
		    logingpage.loginButtonClick();
		    
		   
	   }

}

