package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Actions ac;
	
	public static Properties read_property_file() throws IOException {
		String path= System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\propertyDefine.properties";
		FileInputStream f1= new FileInputStream(path);
		prop= new Properties();
		prop.load(f1);
		return prop;
		
	}
	//initialization of driver class
	public static void initialize() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties p= read_property_file();
		driver.get(p.getProperty("url"));
		ac = new Actions(driver);
		
	}
	
	public void closure()
	{
		driver.quit();
	}

}
