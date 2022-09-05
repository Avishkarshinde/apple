
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DashboardPage extends TestBase{

	@FindBy(xpath = "//span[text()='Rutuja']")WebElement NickNameLebel1;
	@FindBy(xpath = "//span[@class='user-id']")WebElement UserId;
	@FindBy(xpath = "//h4[@class='username']")WebElement UserNameLebel;
	@FindBy(xpath = "//div[@class='email']")WebElement EmailLebel;
	@FindBy(xpath = "//span[@class='icon icon-exit']")WebElement LogoutLink;
    @FindBy(xpath ="//div[@class='avatar']")WebElement AvtarBtn;
    
public DashboardPage()
{
	PageFactory.initElements(driver,this);
}
public String verifyNickName() throws Throwable
{
	
	
	return NickNameLebel1.getText();
}
public String verifyUserId() 
{
	AvtarBtn.click();
	 return UserId.getText();
}
public void verifyLogoutLink() 
{
	AvtarBtn.click();
	LogoutLink.click();
}


	



















}