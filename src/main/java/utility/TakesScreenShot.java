package utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


	
	public	class	TakesScreenShot	{
		public static		void	captureScreenshotFailedTC (WebDriver	driver)	throws	Exception	
		{
		File	source	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		File	dest	=	new	File("C:\\Users\\Rutuja\\eclipse-workspace\\frame2\\screenshot\\"  +".png");
		FileHandler.copy(source,	dest);
}
	}
