package pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class VGEmployeeDirectory<WebElements> {

	
	WebDriver driver;
	WebDriverWait wait;
	
	public VGEmployeeDirectory(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	
	@FindBy(css="div h1")
	WebElement titleofPage;
	
	@FindBy(xpath="//span[text()='Add Employee']")
	WebElement addEmployee;
	
	@FindBy(xpath="//div/div/button[2]")
	WebElement countryFilter;
	
	@FindBy(css="div.MuiAutocomplete-popper")
	WebElement countryDropdown;
	
	@FindBy(css="button[aria-label='Close']")
	WebElement cellFilterArrow;
	
	@FindBy(css="input[name='cellid']")
	WebElement cellFilterbox;
	
	@FindBy(name="departmentid")
	WebElement departmentFilter;
	
	@FindBy(xpath="//span[text()='SUBMIT']")
	WebElement submit;
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container']/div/div/div[5]/div")
	WebElement clear;
	
	@FindBy(css="thead[class='MuiTableHead-root'] tr")
	WebElement tableHeader;

	@FindBy(xpath="//thead[@class='MuiTableHead-root']/tr/th[1]")
	WebElement firstColumnTitle;
	
	@FindBy(xpath="//thead[@class='MuiTableHead-root']/tr/th[2]")
	WebElement secondColumnTitle;
	
	@FindBy(xpath="//thead[@class='MuiTableHead-root']/tr/th[3]")
	WebElement thirdColumnTitle;
	
	@FindBy(xpath="//thead[@class='MuiTableHead-root']/tr/th[4]")
	WebElement fourthColumnTitle;
	
	@FindBy(xpath="//thead[@class='MuiTableHead-root']/tr/th[5]")
	WebElement fifthColumnTitle;
	
	@FindBy(xpath="//thead[@class='MuiTableHead-root']/tr/th[6]")
	WebElement sixthColumnTitle;
	
	@FindBy(xpath="//thead[@class='MuiTableHead-root']/tr/th[7]")
	WebElement seventhColumnTitle;
	
	@FindBy(xpath="//thead[@class='MuiTableHead-root']/tr/th[8]")
	WebElement eighthColumnTitle;
	
	@FindBy(xpath="//thead[@class='MuiTableHead-root']/tr/th[9]")
	WebElement ninethColumnTitle;
	
	@FindBy(xpath="//tbody/tr")
	List<WebElement> tableRows;
	
	@FindBy(xpath="//tbody/tr")
	By locateTableRows;
	
	@FindBy(xpath="//tbody/tr/td[3]")
	List<WebElement> countryColumn;

	@FindBy(xpath="//tbody/tr[1]")
	WebElement firstRow;
	
	@FindBy(xpath="//tbody/tr[1]/td")
	List<WebElement> firstRowElements;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	WebElement firstRowFirstColumn;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]")
	WebElement firstRowSecondColumn;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]")
	WebElement firstRowThirdColumn;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]")
	WebElement firstRowFourthColumn;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]")
	WebElement firstRowFifthColumn;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]")
	WebElement firstRowSixthColumn;
	
	@FindBy(xpath="//tbody/tr[1]/td[7]")
	WebElement firstRowSeventhColumn;
	
	
	@FindBy(css="span.MuiTypography-root.MuiTypography-h2.MuiTypography-noWrap")
	WebElement addEmployeeModalTitle;
	
	@FindBy(css="input[name='firstname']")
	
	WebElement firstName;
	
	@FindBy(css="input[name='lastname']")
	WebElement lastName;
	
	@FindBy(css="input[name='emailid']")
	WebElement emailId;
	
	@FindBy(css="input[name='password']")
	WebElement password;
	
	@FindBy(css="input[name='cpassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//div[@class='MuiDialogContent-root']/div/div[6]/div/div/div")
	WebElement selectCountry;
	
	@FindBy(xpath="//div[@role='presentation']/div/ul[@role='listbox']/li[3]")
	WebElement selectCountryUS;
	
	@FindBy(xpath="//div[@role='presentation']/div/ul[@role='listbox']/li[2]")
	WebElement selectCountryMexico;
	
	@FindBy(xpath="//div[@role='presentation']/div/ul[@role='listbox']/li[1]")
	WebElement selectCountryChile;
	
	@FindBy(xpath="//div[@class='MuiDialogContent-root']/div/div[7]/div/div/div")
	WebElement selectCell;
	
	@FindBy(xpath="//ul/li[1]")
	WebElement selectCellOption1;
	
	@FindBy(xpath="//ul/li[2]")
	WebElement selectCellOption2;
	
	@FindBy(xpath="//ul/li[3]")
	WebElement selectCellOption3;

	@FindBy(xpath="//div[@class='MuiDialogContent-root']/div/div[8]/div/div/div")
	WebElement selectDepartment;
	
	@FindBy(xpath="//ul/li[1]")
	WebElement selectDepartmentOperation;
	
	@FindBy(xpath="//ul/li[2]")
	WebElement selectDepartmentAdmin;
	
	@FindBy(xpath="//ul/li[3]")
	WebElement selectDepartmentSales;
	
	
	@FindBy(xpath="//label[@class='MuiFormControlLabel-root'][1]")
	WebElement leaderYes;
	
	@FindBy(xpath="//label[@class='MuiFormControlLabel-root'][2]")
	WebElement leaderNo;
	
	@FindBy(id="countryCode")
	WebElement countryCode;
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12'][1]/div[@inputmode='numeric']/div/input")
	WebElement phoneNumber;
	
	@FindBy(css="div input[name='contact']")
	WebElement editPhoneNumber;
	
	@FindBy(css="input[name='dateofhire']")
	WebElement dateOfHire;
	
	@FindBy(css="div input[accept*='.png']")
	WebElement profilePicture;
	
	@FindBy(css="input[name='birthday']")
	WebElement birthDate;
	
	@FindBy(css="input[name='languagesknown']")
	WebElement languagesKnown;
	
	@FindBy(css="input[name='linkedin']")
	WebElement linkedIn;
	
	@FindBy(css="div.jss67 button")
	WebElement submitEmployee;
	
	@FindBy(css="tbody tr:nth-child(1) td:nth-child(8) svg")
	WebElement editEmployee;
	
	@FindBy(css="span.MuiTypography-root.MuiTypography-h2.MuiTypography-noWrap")
	WebElement editModalTitle;
	
	@FindBy(css="tbody tr:nth-child(1) td:nth-child(9) svg")
	WebElement deleteEmployee;
	
	@FindBy(css="div[aria-haspopup='listbox']")
	WebElement paginationDropdown;
	
	@FindBy(css="div span[title='Previous Page']")
	WebElement previousPage;
	
	@FindBy(css="div span[title='Next Page']")
	WebElement nextPage;
	
	@FindBy(css="div h2")
	WebElement deleteModalTitle;
	
	@FindBy(xpath="//div[@role='dialog']/div[3]/button[1]")
	WebElement deleteYes;
	
	@FindBy(xpath="//div[@role='dialog']/div[3]/button[2]")
	WebElement deleteNo;
	
	public WebElement DeleteModalTitle()
	{
		return deleteModalTitle;
	}
	public WebElement DeleteYes()
	{
		return deleteYes;
	}
	public WebElement DeleteNo()
	{
		return deleteNo;
	}
	public WebElement TitleofPage()
	{
		return titleofPage;
	}
	public WebElement AddEmployee()
	{
		return addEmployee;
	}
	public WebElement CountryFilter()
	{
		return countryFilter;
	}
	public WebElement CountryDropdown()
	{
		return countryDropdown;
	}
	public WebElement CellFilterArrow()
	{
		return cellFilterArrow;
	}
	public WebElement CellFilterBox()
	{
		return cellFilterbox;
	}
	public WebElement DepartmentFilter()
	{
		return departmentFilter;
	}
	public WebElement Submit()
	{
		return submit;
	}
	public WebElement Clear()
	{
		return clear;
	}
	public WebElement TableHeader()
	{
		return tableHeader;	
	}
	public WebElement FirstColumnTitle()
	{
		return firstColumnTitle;
	}
	public WebElement SecondColumnTitle()
	{
		return secondColumnTitle;
	}
	public WebElement ThirdColumnTitle()
	{
		return thirdColumnTitle;
	}
	public WebElement FourthColumnTitle()
	{
		return fourthColumnTitle;
	}
	public WebElement FifthColumnTitle()
	{
		return fifthColumnTitle;
	}
	public WebElement SixthColumnTitle()
	{
		return sixthColumnTitle;
	}
	public WebElement SeventhColumnTitle()
	{
		return seventhColumnTitle;
	}
	public WebElement EighthColumnTitle()
	{
		return eighthColumnTitle;
	}
	public WebElement ninethColumnTitle()
	{
		return ninethColumnTitle;
	}
	public List<WebElement> TableRows()
	{
		return tableRows;
	}
	public By locateTableRows()
	{
		return locateTableRows;
	}
	public List<WebElement> CountryColumn()
	{
		return countryColumn;
	}
	
	public WebElement FirstRow()
	{
		return firstRow;
	}
	public List<WebElement> FirstRowElements()
	{
		return firstRowElements;
	}
	public WebElement firstRowFirstColumn()
	{
		return firstRowFirstColumn;
	}
	public WebElement firstRowSecondColumn()
	{
		return firstRowSecondColumn;
	}
	public WebElement firstRowThirdColumn()
	{
		return firstRowThirdColumn;
	}
	public WebElement firstRowFourthColumn()
	{
		return firstRowFourthColumn;
	}
	public WebElement firstRowFifthColumn()
	{
		return firstRowFifthColumn;
	}
	public WebElement firstRowSixthColumn()
	{
		return firstRowSixthColumn;
	}
	public WebElement firstRowSeventhColumn()
	{
		return firstRowSeventhColumn;
	}
	
	public WebElement AddEmployeeModalTitle()
	{
		return addEmployeeModalTitle;
	}
	public WebElement FirstName()
	{	
		return firstName;
	}
	public WebElement LastName()
	{
		return lastName;
	}
	public WebElement EmailId()
	{
		return emailId;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement ConfirmPassword()
	{
		return confirmPassword;
	}
	public WebElement SelectCountry()
	{
		return selectCountry;
	}
	public WebElement SelectCountryUS()
	{
		return selectCountryUS;
	}
	public WebElement selectCountryMexico()
	{
		return selectCountryMexico;
	}
	public WebElement selectCountryChile()
	{
		return selectCountryChile;
	}
	public WebElement SelectCell()
	{
		return selectCell;
	}
	public WebElement SelectCellOption1()
	{
		return selectCellOption1;
	}
	public WebElement SelectCellOption2()
	{
		return selectCellOption2;
	}
	public WebElement SelectCellOption3()
	{
		return selectCellOption3;
	}
	public WebElement SelectDepartment()
	{
		return selectDepartment;
	}
	public WebElement SelectDepartmentOperation()
	{
		return selectDepartmentOperation;
	}
	public WebElement SelectDepartmentAdmin()
	{
		return selectDepartmentAdmin;
	}
	public WebElement SelectDepartmentSales()
	{
		return selectDepartmentSales;
	}
	public WebElement LeaderYes()
	{
		return leaderYes;
	}
	public WebElement LeaderNo()
	{
		return leaderNo;
	}
	public WebElement CountryCode()
	{
		return countryCode;
	}
	public WebElement PhoneNumber()
	{
		return phoneNumber;
	}
	public WebElement EditPhoneNumber()
	{
		return editPhoneNumber;
	}
	
	public WebElement DateOfHire()
	{
		return dateOfHire;
	}
	public WebElement ProfilePicture()
	{
		return profilePicture;
	}
	public WebElement BirthDate()
	{
		return birthDate;
	}
	public WebElement LanguagesKnown()
	{
		return languagesKnown;
	}
	public WebElement LinkedIn()
	{
		return linkedIn;
	}
	public WebElement SubmitEmployee()
	{
		return submitEmployee;
	}
	public WebElement EditEmployee()
	{
		return editEmployee;
	}
	public WebElement EditModalTitle()
	{
		return editModalTitle;
	}
	
	public WebElement DeleteEmployee()
	{
		return deleteEmployee;
	}
	public WebElement PaginationDropdown()
	{
		return paginationDropdown;
	}
	public WebElement PreviousPage()
	{
		return previousPage;
	}
	public WebElement NextPage()
	{
		return nextPage;
	}

	
	
	
	
}
