package VGP;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

import javax.swing.table.TableRowSorter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.NavigateToEmployeeDirectoryPage;
import pageObjects.VGDashboardPage;
import pageObjects.VGEmployeeDirectory;
import pageObjects.VGLoginPage;
import resources.base;

public class DeleteEmployee<WebElements> extends NavigateToEmployeeDirectoryPage {
	
	@Test
	
	public void DeleteEmployee() throws IOException
	{
		NavigatetoEmployeePage();
		VGEmployeeDirectory e = new VGEmployeeDirectory(driver);
		
		
		new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//tbody/tr"), 15));
		
		int actualCount = e.TableRows().size();
		System.out.println(actualCount);
		
		e.DeleteEmployee().click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(e.DeleteModalTitle()));
		Assert.assertEquals(e.DeleteModalTitle().getText(), "Are you sure you want to delete?");
		e.DeleteYes().click();
		
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElements(e.TableRows())));

		int newCount = e.TableRows().size();
		System.out.println(newCount);
		
		Assert.assertEquals(actualCount-1, newCount);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
