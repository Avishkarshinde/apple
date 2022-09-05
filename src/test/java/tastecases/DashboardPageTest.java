package tastecases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardPageTest extends TestBase{
	 DashboardPage dash;
	 LoginPage login;
	
@BeforeMethod
	public void setup() throws Throwable
	{
	initalization();
	login = new LoginPage();
	dash = new  DashboardPage();
	login.LoginzerodhApp();
	Thread.sleep(2000);
	}


@Test
public void verifyNickNameTest() throws Throwable 
{
	String value = dash.verifyNickName();
	System.out.println(value);
}
@Test 
public void verifyerifyUserIdTest() {
	String value = dash.verifyUserId();
	System.out.println(value);
	
}
@Test
public void veryfyLogoutLinkTest() {
	dash.verifyLogoutLink();
}


@AfterMethod

public void exit()
{
	driver.close();
}

}	

	
	
	
	
	
	
	