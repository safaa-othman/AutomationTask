package testPackage;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisteredNewAccount;

public class TestNewAccount {
	WebDriver driver;
	HomePage home;
	RegisteredNewAccount createNewAccount;
	Date date = new Date();
	String current_time = date.getTime() + "";
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	}
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1024,768));
		createNewAccount = new RegisteredNewAccount(driver);
		home= new HomePage(driver);
	}

	@Test( description = "Create new account")

	public void NewAccount() {
// Home page tests

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// login trigger
		home.getUrl();
		home.clickOnLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// create on email
		home.enterNewEmail("safaa" + current_time.substring(10) + "@gmail.com");
		// submit create
		home.clickOnSubmit();
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// Registration page tests
		// select gender
		createNewAccount.selectGender();
		// set value of firstname
		createNewAccount.EnterFirstName("kareem");
		// set value of lastname
		createNewAccount.EnterLastName("otman");
		// enter password
		createNewAccount.EnterPassword("Saraothman@123");
		// select all days
		createNewAccount.selectDays();
		// select a day
		createNewAccount.selectDay();
		// select all months
		createNewAccount.selectMonths();
		// select a month
		createNewAccount.selectMonth();
		// select all years
		createNewAccount.selectYears();
		// select a year
		createNewAccount.selectYear();
		// recive newsLetter
		createNewAccount.reciveNewLetter();
		// select option
		createNewAccount.selectOptin();
		// select company
		createNewAccount.selectCompany("egypt");
		// enter first address
		createNewAccount.EnterFirstAddress("abbas st. , nasr city , cairo");
		// enter secondaddress
		createNewAccount.EnterSecondAddress("moheb st. , tanta city , gharbia");
		// enter city
		createNewAccount.EnterCity("Cairo");
		// select states
		createNewAccount.selectStates();
		// select state
		createNewAccount.selectState();
		// enter post code
		createNewAccount.enterPostcode("00020");
		// enter post code
		createNewAccount.enterCountry();
		// enter comments
		createNewAccount.enterComments("thank you for reach out");
		// enter phone
		createNewAccount.enterPhone("02565228774");
		// enter phone mobile
		createNewAccount.enterPhoneMobile("011226698774");
		// enter alias address
		createNewAccount.enterAliasAddress("tanta- tanta");
		// click submit
		createNewAccount.submitAccount();
		// back to home
		createNewAccount.backToHome();
		// hover on woman
		home.hoverOnWomenCategory();
		// click on subcatigory - Blouses 
		home.clickBlouses();
		// hover on product
		home.hoveronprod();
		// click on add to cart
		home.clickAddToCart();
		// proceedd to checkout
		home.proceedToCheckout();
		// nest steps
		home.nextStep2();
		home.nextStep3();
		home.clickagreeCheckbox();
		// lat stap 

		home.lastStep();
	}
}
