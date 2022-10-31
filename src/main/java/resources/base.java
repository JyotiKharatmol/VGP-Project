package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public WebDriver driver; 
	public Properties pro;

	public WebDriver initializeBrowser() throws IOException
	{
		//chrome
		//firefox
		//edge

		FileInputStream fis = new FileInputStream("C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Desktop\\VGP\\src\\main\\java\\resources\\data.properties");
		pro = new Properties();
		pro.load(fis);
		String browserName = pro.getProperty("browser");
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			
		 driver = new ChromeDriver();
			
		}
		

		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\GeckoDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			
		 driver = new FirefoxDriver();
			
		}
		
		if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Documents\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
			
		 driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
		
	}
	
	public static void sendKeys(WebDriver driver, WebElement element, Duration timeout, String value){
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeSelected(element));
		
		
	
	
	
}
}
