 package tastecases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import utility.TakesScreenShot;


public class LoginPageTest extends TestBase{
	LoginPage login;
	@BeforeMethod
	public void setup()
	{
		initalization();
	 login= new LoginPage();
    
	}
	

	@Test
	public void varifyAppTittleTest()
	{
//		 login= new LoginPage();
//		initalization();
		String ActTitle =login.varifyAppTittle();
		System.out.println(ActTitle);
		Assert.assertTrue(false);
	//	driver.close();
	}
	@Test
	public void varifyKiteLebelTest() 
	{
	
	    String actlebel = login.varifyKiteLebel();	
		System.out.println(actlebel);
		
		//driver.close();
		}
	
	@Test
	public void varifyKiteLogoTest()
	{
	
		boolean result = login.varifyKiteLogo();
		System.out.println(result);
		//driver.close();
	}
	@Test 
	public void LoginzerodhAppText() throws Throwable  
	{
		login.LoginzerodhApp();
	}
	@AfterMethod

	public	void	exit(ITestResult	z)	throws	Exception	
	{
	if(ITestResult.FAILURE	==	z.getStatus())
	{
	TakesScreenShot.captureScreenshotFailedTC(driver);
	}
	driver.quit();
	}
}
	