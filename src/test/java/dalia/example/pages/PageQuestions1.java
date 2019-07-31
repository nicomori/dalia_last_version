package dalia.example.pages;

import java.lang.invoke.MethodHandles;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageQuestions1 {
	
	WebDriver driver;
	protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());


	public PageQuestions1(WebDriver driver) {
		this.driver = driver;
	}

	// Variables section
	
	// Locator section
	By checkboxQuestion1 = By.xpath("//*[@class='question_option question_option_background_hover ng-scope']/input");
	By buttonNext = By.xpath("(//button)[2]");

	// Method section
	/**
	 * this method make click in the questions and make click in the the button next.
	 * 
	 */
	public void makeClickInTheQuestionsAndPressNextInThePage1() {
		logger.info("Starting to make click in the checkbox of the first page.");
		
		@SuppressWarnings("unused")
		WebElement myDynamicElement = (new WebDriverWait(driver, 15))
				.until(ExpectedConditions.presenceOfElementLocated(checkboxQuestion1));
		
		WebElement element = driver.findElement(checkboxQuestion1);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		try {
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			executor.executeScript("arguments[0].click();", element);
		}		
		
		logger.info("Starting to make click in the button next of the first page.");
		driver.findElement(buttonNext).click();
	}

}
