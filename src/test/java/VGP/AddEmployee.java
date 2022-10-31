package VGP;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.NavigateToEmployeeDirectoryPage;
import pageObjects.VGEmployeeDirectory;
import resources.base;


public class AddEmployee extends NavigateToEmployeeDirectoryPage {
	
	
	@Test(dataProvider="getData")
	
	public void AddEmployee(String FirstName, String LastName, String Password, String ConfirmPassword, String CountryCode, String DateOfHire, String Profilepic, String BirthDate, String Lang, String LinkedInURL) throws IOException
	{
		
		NavigatetoEmployeePage();
		VGEmployeeDirectory e = new VGEmployeeDirectory(driver);
		
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(e.AddEmployee()));
		
		e.AddEmployee().click();
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(e.AddEmployeeModalTitle()));
		
		Assert.assertEquals(e.AddEmployeeModalTitle().getText(), "Add a Employee");
		                               
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(e.FirstName()));
		
		e.FirstName().sendKeys(FirstName);
		e.LastName().sendKeys(LastName);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100);
		int randomInt1 = randomGenerator.nextInt(945678032);
		e.EmailId().sendKeys("jyoti.kharatmol+"+randomInt+"@azularc.com");
		e.Password().sendKeys(Password);
		e.ConfirmPassword().sendKeys(ConfirmPassword);
		e.SelectCountry().click();
		e.selectCountryMexico().click();
		e.SelectCell().click();
		e.SelectCellOption1().click();
		e.SelectDepartment().click();
		e.SelectDepartmentAdmin().click();
		e.LeaderYes().click();
		e.CountryCode().sendKeys(CountryCode);
		e.PhoneNumber().sendKeys("9"+randomInt1);
		e.DateOfHire().sendKeys(DateOfHire);
		e.ProfilePicture().sendKeys(Profilepic);
		e.BirthDate().sendKeys(BirthDate);
		e.LanguagesKnown().sendKeys(Lang);
		e.LinkedIn().sendKeys(LinkedInURL);
		e.SubmitEmployee().click();
		
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElements(e.TableRows())));

		List<WebElement> elements=driver.findElements(By.xpath("//tbody/tr[1]/td"));

		for(int i=0;i<elements.size();i++)
		{
			Assert.assertEquals(elements.get(0).getText(), "Jyoti Kharatmol");
			Assert.assertEquals(elements.get(1).getText(), "Leader");
			Assert.assertEquals(elements.get(2).getText(), "Mexico");
			Assert.assertEquals(elements.get(3).getText(), "1");
			Assert.assertEquals(elements.get(4).getText(), "Admin");
			Assert.assertEquals(elements.get(5).getText(), "jyoti.kharatmol+"+randomInt+"@azularc.com");
			Assert.assertEquals(elements.get(6).getText(), "+91 9"+randomInt1);
			
			break;
		}	
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data = new Object[1][10];
		data[0][0]= "Jyoti";
		data[0][1]="Kharatmol";
		data[0][2]="A@1234!";
		data[0][3]="A@1234!";
		data[0][4]="91";
		data[0][5]="03032010";
		data[0][6]="C:\\Users\\jyoti_xfiqe3z\\Downloads\\php.png";
		data[0][7]="01122018";
		data[0][8]="English, Hindi, Marathi";
		data[0][9]="https://www.linkedin.com/uas/login-submit";
		return data;
	}
}
