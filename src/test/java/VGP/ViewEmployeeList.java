package VGP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ViewEmployeeList {

	
	@Test
	public void viewEmployeeList()
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
	
}
