package page;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;

public class Managecatagorypage 
{
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']") WebElement ManageCatagryMoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']") WebElement ManageCatagoreyNewsbuttonclick;
	@FindBy(xpath="//input[@name=\"category\"]") WebElement ManageCatagoryTitle;
	@FindBy(xpath="//input[@name='main_img' and @id='main_img']") WebElement ChoseFileButton;
	@FindBy(xpath="'//button[@name='create']'") WebElement SavebuttonClick;
	
	
	public WebDriver driver;
	
	public Fileuploadutility fileuploadutility = new Fileuploadutility ();
	
	
	
	  public Managecatagorypage (WebDriver driver)
	  {
		  this.driver=driver;
		 PageFactory.initElements(driver, this);
	  }
	  
	  public void  manageCatagryMoreinfo()
	  {
		  ManageCatagryMoreinfo.click();
	  }
	  public void   manageCatagoreyNewsbuttonclick()
	  {
		  ManageCatagoreyNewsbuttonclick.click();
	  }
	  public void   manageCatagoryTitle(String ManageCatagoryTitletext)
	  {
		  ManageCatagoryTitle.sendKeys(ManageCatagoryTitletext);
	  }
	  
	  public void   choseFileButton() throws AWTException
	  {
		  fileuploadutility.fileUploadUsingRobot(ChoseFileButton, Constant.IMAGEUPLOAD );
	  }
		
	  
	  public void   savebuttonClick()
	  {
		  SavebuttonClick.click();
	  }
	  
	  
	  
	  

}
