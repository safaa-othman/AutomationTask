package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	// ********************* variabuls *********************

	WebDriver driver;
	String url = "http://automationpractice.com/index.php";

	// ********************* constractor *********************

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}
	// ********************* locator *********************

	By loginButton = By.className("login");
	By newEmail = By.id("email_create");
	By submitButton = By.id("SubmitCreate");
	By WomenCtegory = By.xpath("//a[@title='Women']");
	By blouses = By.xpath("//a[text()='Blouses']");
	By hoverinbloses = By.xpath("//img[@alt='Blouse']");
	By addToCart = By.xpath("//a[@title='Add to cart']");
	By checkOut = By.xpath("//span[normalize-space()='Proceed to checkout']");
	By checkNextStep = By.xpath("//span[text()='Proceed to checkout']");
	By agreeCheckbox = By.id("cgv");
	By clickProceed = By.xpath("//span[normalize-space()='Proceed to checkout'][1]");
	// ********************* keywords *********************

	public void getUrl() {
		driver.navigate().to(url);
	}

	// click on login trigger
	public void clickOnLogin() {
		driver.findElement(loginButton).click();
	}

	// create email
	public void enterNewEmail(String setEmail) {
		driver.findElement(newEmail).sendKeys(setEmail);
	}

	// Submit Create
	public void clickOnSubmit() {
		driver.findElement(submitButton).click();
	}

	// hover On Women category
	public void hoverOnWomenCategory() {
		Actions actions = new Actions(driver);
		WebElement women = driver.findElement(WomenCtegory);
		actions.moveToElement(women).perform();
	}

	public void clickBlouses() {
		driver.findElement(blouses).click();
	}

	public void hoveronprod() {
		Actions actions = new Actions(driver);
		WebElement product = driver.findElement(hoverinbloses);
	   actions.moveToElement(product).perform();
}
	public void clickAddToCart() {
		driver.findElement(addToCart).click();
	}
	public void proceedToCheckout() {
		driver.findElement(checkOut).click();
	}
	public void nextStep2() {
		driver.findElement(checkNextStep).click();
	}
	public void nextStep3() {
		driver.findElement(checkNextStep).click();
	}
	public void clickagreeCheckbox() {
		driver.findElement(agreeCheckbox).click();
	}
	public void lastStep() {
		driver.findElement(clickProceed).click();
	}
}
