package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VGDashboardPage {

	public WebDriver driver; 
	
	public VGDashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="button[aria-label='open drawer']")
	WebElement menuIcon;
	

	@FindBy(xpath="//a[contains(@href,'employee-directory')]/div")
	WebElement employeeDirectorynav;

	public WebElement MenuIcon()
	{
		return menuIcon;
	}

	public WebElement EmployeeDirectorynav()
	{
	return employeeDirectorynav;
	}
	
	
}
