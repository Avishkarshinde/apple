
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.ReadProperty;

public class LoginPage extends TestBase  {

	
	
		//Object	Repository
	@FindBy(xpath="//img[@alt='Kite']")     	private	WebElement	kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")     private	WebElement	zerodhaLogo;
	@FindBy(xpath="//input[@id='userid']")	   private	WebElement	userIdTextbox;
	
	@FindBy(xpath="//input[@id='password']")	private	WebElement passwordTextbox;
	@FindBy(xpath="//button[@type='submit']")	private	WebElement	LoginBtn;
	@FindBy(xpath="//div[@class='form-header text-center']")private WebElement loginlebel;	
	//WebElement	loginLabel;
	@FindBy(xpath="//input[@id='pin']")      	private	WebElement	pinTextbox;
	@FindBy(xpath="//button[@type='submit']")	private	WebElement	continueBtn;
	@FindBy(xpath="//span[@class='nickname']")	private	WebElement	nicknameLabel;
	
	
		public	LoginPage()
	{
	PageFactory.initElements(driver,	this);
	}
		
		public void LoginzerodhApp() 
		
		{
			userIdTextbox.sendKeys("JRT699");
			passwordTextbox.sendKeys("Rutuja@123");
			LoginBtn.click();
			pinTextbox.sendKeys("091999");
			continueBtn.click();
		}
		
	public String varifyAppTittle	() 
	{
	return	driver.getTitle();
	}
	
	public String varifyKiteLebel	() {
	return	loginlebel.getText();
	}
		
    public boolean varifyKiteLogo()
    {
    	 return kiteLogo.isDisplayed();
    }
		
		
		
		
		
		
		
		
}
