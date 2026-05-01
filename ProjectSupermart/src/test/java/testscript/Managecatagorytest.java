package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import page.Excelutility;
import page.Loginpage;
import page.Managecatagorypage;

public class Managecatagorytest  extends Base
{
	
	
	@Test
	
	public void verifyThatTheUserShouldAbleToAddCatagoryVaiManageCatagory() throws IOException, AWTException
	{
		String Username= Excelutility.getStringData(1, 0, "Loginuser");
	    String Password= Excelutility.getStringData(1, 1, "Loginuser");
	    
	    Loginpage logingpage= new Loginpage(driver);
	    logingpage.loginUsername(Username);
	    logingpage.loginPassword(Password);
	    logingpage.loginButtonClick();
	    
	    Managecatagorypage managecatagory= new  Managecatagorypage(driver);
	    managecatagory.manageCatagryMoreinfo();
	    managecatagory.manageCatagoreyNewsbuttonclick();
	    String CatagoryTitle= Excelutility.getStringData(0, 0, "Managecatagory");
	    managecatagory.manageCatagoryTitle(CatagoryTitle);
	    managecatagory.choseFileButton();
	    managecatagory.savebuttonClick();
	    
	}

}
