package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisteredNewAccount {

	// ********************* variabuls  ********************* 
	WebDriver driver;

	// ********************* constructor *********************//
	public RegisteredNewAccount(WebDriver driver) {
		this.driver = driver;
	}
	// ********************* locators *********************//
	By gender =By.xpath("//input[@id='id_gender2']");
	By firstName = By.id("customer_firstname");
	By lastName = By.id("customer_lastname");
	By password = By.id("passwd");
	By alldays = By.id("days");
	By day = By.xpath("//option[@value='21']");
	By allmonths = By.id("months");
	By month =  By.cssSelector("#months > option:nth-child(4)");
	By allyears = By.id("years");
	By year = By.xpath("//option[@value='1997']");
	By newsLetter = By.id("newsletter");
	By option = By.id("optin");
	By company = By.id("company");
	By firstAddress = By.id("address1");
	By secondAddress = By.id("address2");
	By city = By.id("city");
	By allStates = By.id("id_state");
	By state = By.xpath("//option[@value='33']");
	By postCode = By.id("postcode");
	By allCountries = By.id("id_country");
	By setcountry = By.xpath("//option[@value='21']");
	By addcomments = By.id("other");
	By addphone = By.id("phone");
	By mobilePhone = By.id("phone_mobile");
	By aliasAddress = By.id("alias");
	By submitform =By.id("submitAccount");
	By backToHome = By.xpath("//a[@title='Home']");
	// ********************* keywords ********************* //
	
	// select gender
	public void selectGender() {
		driver.findElement(gender).click();
	}
	// set first name
	public void EnterFirstName(String fName) {
		driver.findElement(firstName).sendKeys(fName);
	}
	// set last name
	public void EnterLastName(String lName) {
		driver.findElement(lastName).sendKeys(lName);
	}
	// enter password
	public void EnterPassword(String passWord) {
		driver.findElement(password).sendKeys(passWord);
	}
	// select all days
	public void selectDays() {
		driver.findElement(alldays).click();
	}
	// select a day
	public void selectDay() {
		driver.findElement(day).click();
	}
	// select all months
	public void selectMonths() {
		driver.findElement(allmonths).click();
	}
	// select a month
	public void selectMonth() {
		driver.findElement(month).click();
	}
	// select all years
	public void selectYears() {
		driver.findElement(allyears).click();
	}
	// select year
	public void selectYear() {
		driver.findElement(year).click();
	}
	// recive newsLetter
	public void reciveNewLetter() {
		driver.findElement(newsLetter).click();
	}
	// select option
	public void selectOptin() {
		driver.findElement(option).click();
	}
	// select company
	public void selectCompany(String companyname) {
		driver.findElement(company).sendKeys(companyname);
	}
	// enter first address
	public void EnterFirstAddress(String address1) {
		driver.findElement(firstAddress).sendKeys(address1);
	}
	// enter second address
	public void EnterSecondAddress(String address2) {
		driver.findElement(secondAddress).sendKeys(address2);
	}
	// enter city
	public void EnterCity(String cityname) {
		driver.findElement(city).sendKeys(cityname);
	}
	// select all states
	public void selectStates() {
		driver.findElement(allStates).click();
	}
	// select a state
	public void selectState() {
		driver.findElement(state).click();
	}
	// enter post code
	public void enterPostcode(String postcode) {
		driver.findElement(postCode).sendKeys(postcode);
	}
	// enter all countries
	public void enterCountries() {
		driver.findElement(allCountries).click();
	}
	// enter a country
	public void enterCountry() {
		driver.findElement(setcountry).click();
	}
	// enter comments
	public void enterComments(String comment) {
		driver.findElement(addcomments).sendKeys(comment);
	}
	// enter phone
	public void enterPhone(String setphone) {
		driver.findElement(addphone).sendKeys(setphone);
	}
	// enter phonemobile
	public void enterPhoneMobile(String mobile) {
		driver.findElement(mobilePhone).sendKeys(mobile);
	}
	// enter alias address
	public void enterAliasAddress(String aliasAddr) {
		driver.findElement(aliasAddress).sendKeys(aliasAddr);
	}
	// enter submit 

	public void submitAccount() {
		driver.findElement(submitform).click();
	}
	// back to home
	public void backToHome() {
		driver.findElement(backToHome).click();
	}
	
}