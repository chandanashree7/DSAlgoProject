package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	private static Properties properties;
	private final String propertyFilepath="src/test/resources/config/Config.properties";
	public static WebDriver driver;
	
	public BaseClass(){
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilepath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilepath);
			}		
		}
	
	/*public static WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver.get();
	}*/
	
	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		String browserName=properties.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
	}
	 
	public static String getProperty(String key) {
	        return properties == null ? null : properties.getProperty(key, "");
	  }
}
	