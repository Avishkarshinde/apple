package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.hpsf.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	
	public	static	WebDriver	driver;
	public	void	initalization()
	{
	System.setProperty("Webdriver.chrome.driver"," C:\\Users\\Rutuja\\eclipse-workspace\\frame2\\chromedriver.exe");
	driver	=	new	ChromeDriver();
	driver.get("https://kite.zerodha.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	}



		
	
