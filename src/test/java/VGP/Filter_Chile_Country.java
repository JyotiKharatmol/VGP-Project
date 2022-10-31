package VGP;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.NavigateToEmployeeDirectoryPage;
import pageObjects.VGEmployeeDirectory;
import org.openqa.selenium.StaleElementReferenceException;
public class Filter_Chile_Country extends NavigateToEmployeeDirectoryPage 

{
	
	@Test
	public void Clear() throws IOException
	{
		NavigatetoEmployeePage();
		VGEmployeeDirectory e = new VGEmployeeDirectory(driver);
		
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(e.CountryFilter()));

		e.CountryFilter().click();
		
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(e.CountryDropdown()));

		
		e.selectCountryChile().click();
		new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(e.Submit()));
		
		e.Submit().click();
		
		List<WebElement> col = driver.findElements(By.xpath("//tbody/tr/td[3]"));
		
		
		for(int i=0; i<col.size();i++)
		{
			if(col.get(i).getText().equals("Chile"))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			break;
		}
	
		
		
	}
	
}
