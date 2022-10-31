package VGP;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.function.Function;
import java.util.random.RandomGenerator;

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

public class EditEmployee extends NavigateToEmployeeDirectoryPage {
	
	
	@Test(dataProvider="getEditData")
	
	
	public void EditEmployee(String FirstName, String LastName, String CountryCode, String DateOfHire, String Profilepic, String BirthDate, String Lang, String LinkedInURL) throws IOException
	{
	//Select country, cell, department, select date from the calendar
		NavigatetoEmployeePage();
		VGEmployeeDirectory e = new VGEmployeeDirectory(driver);
		
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(e.EditEmployee()));
		
		e.EditEmployee().click();
		
		new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(e.EditModalTitle()));

		Assert.assertEquals(e.EditModalTitle().getText(),"Edit Details");
		
		e.FirstName().sendKeys(Keys.chord(Keys.CONTROL,"a"), FirstName);
		
		e.LastName().sendKeys(Keys.chord(Keys.CONTROL,"a"),LastName);
		
		Random random = new Random();
		
		int randomInt = random.nextInt();
		
		e.EmailId().sendKeys(Keys.chord(Keys.CONTROL,"a"),"enrique.alvarez+"+randomInt+"@vectorgl.com");
		
		e.LeaderNo().click();
	
		e.CountryCode().sendKeys(Keys.chord(Keys.CONTROL,"a"),CountryCode);
		
		e.EditPhoneNumber().sendKeys(Keys.chord(Keys.CONTROL,"a"), "575676544");
	
		e.DateOfHire().sendKeys(Keys.chord(Keys.CONTROL,"a"),DateOfHire);
		
		e.ProfilePicture().sendKeys(Keys.chord(Keys.CONTROL,"a"), Profilepic);
		
		e.BirthDate().sendKeys(Keys.chord(Keys.CONTROL,"a"), BirthDate);
		
		e.LanguagesKnown().sendKeys(Keys.chord(Keys.CONTROL, "a"), Lang);
		
		e.LinkedIn().sendKeys(Keys.chord(Keys.CONTROL,"a"), LinkedInURL);
		
		e.SubmitEmployee().click();
	
	}
	
	
	@DataProvider
	public Object[][] getEditData()
	{
		Object[][] data = new Object[1][8];
		
		data[0][0]= "Enrique";
		data[0][1]="Alvarez";
		data[0][2]="12";
		data[0][3]="11022018";
		data[0][4]="C:\\Users\\jyoti_xfiqe3z\\OneDrive\\Desktop\\download.jpg";
		data[0][5]="11022018";
		data[0][6]="English, Spanish";
		data[0][7]="https://www.linkedin.com/signup";
		return data;

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
