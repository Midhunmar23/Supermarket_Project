package page;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.WebElement;

public class FileUploadUtility1 
{
	
	
	public void fileUploadUsingRobotClass(WebElement element, String path)
	{
		
		   StringSelection ss= new StringSelection(path);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
	}
	
}

