package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.base;

public class NavigateToEmployeeDirectoryPage extends base {

	public WebDriver driver;
	
	public void NavigatetoEmployeePage() throws IOException
	

	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
		VGLoginPage l = new VGLoginPage(driver);
		l.Email().sendKeys("faisal.khan@azularc.com");
		l.Password().sendKeys("password");
		l.Login().click();
		VGDashboardPage d = new VGDashboardPage(driver);
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(d.EmployeeDirectorynav()));
		d.EmployeeDirectorynav().click();
	
	}
	
	
}
