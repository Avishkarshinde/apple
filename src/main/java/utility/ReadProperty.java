package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty {


		public	static	String	readPropertyFile(String	value)	throws	Exception
		{
		Properties	prop	=	new	Properties();
		FileInputStream	file	=	new	FileInputStream("C:\\Users\\Rutuja\\eclipse-workspace\\frame2\\config.Properties");
		prop.load(file);
		return	prop.getProperty(value);
}
}
