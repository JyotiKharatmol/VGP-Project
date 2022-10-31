package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VGLoginPage {

	WebDriver driver;
	
	public VGLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(id="outlined-basic")
	WebElement email;
	
	@FindBy(css="input[name='password']")
	WebElement password;
	
	@FindBy(css="span.MuiButton-label")
	WebElement login;
	
	@FindBy(css="a[href*='forgot-password']")
	WebElement forgotPassword;
	
	
	public WebElement Email()
	{
	return email;
	}
	
	public WebElement Password()
	{
	return password;
	}
	public WebElement Login()
	{
	return login;
	}
	
	public WebElement ForgotPassword()
	{
	return forgotPassword;
	}
	
	
	
	
	
	
	
	
}
