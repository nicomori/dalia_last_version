package dalia.example.pages;

import java.lang.invoke.MethodHandles;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageQuestions3 {

	WebDriver driver;
	protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

	public PageQuestions3(WebDriver driver) {
		this.driver = driver;
	}

	// Variables section
	// Locator section
	By checkboxQuestion1 = By.xpath("//*[contains(@class,'question_option')][1]/input");
	By checkboxQuestion2 = By.xpath("//*[contains(@class,'question_option')][2]/input");
	By checkboxQuestion3 = By.xpath("//*[contains(@class,'question_option')][3]/input");
	By checkboxQuestion4 = By.xpath("//*[contains(@class,'question_option')][4]/input");
	By checkboxQuestion5 = By.xpath("//*[contains(@class,'question_option')][5]/input");
	By checkboxQuestion6 = By.xpath("//*[contains(@class,'question_option')][6]/input");
	By buttonNext = By.xpath("(//button)[2]");

	// Method section
	/**
	 * this method make click in the questions and make click in the the button
	 * next.
	 * 
	 */
	public void makeClickInTheQuestionsAndPressNextInThePage3() {
		logger.info("Starting to make click in the checkbox of the page 3.");
		
		@SuppressWarnings("unused")
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(checkboxQuestion1));
		
		try {
			Thread.sleep(2222);
		} catch (Exception e) {
		
		}
		
		WebElement element1 = driver.findElement(checkboxQuestion1);
		WebElement element2 = driver.findElement(checkboxQuestion2);
		WebElement element3 = driver.findElement(checkboxQuestion3);
		WebElement element4 = driver.findElement(checkboxQuestion4);
		WebElement element5 = driver.findElement(checkboxQuestion5);
		WebElement element6 = driver.findElement(checkboxQuestion6);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		try {
			executor.executeScript("arguments[0].click();", element1);
		} catch (Exception e) {
			executor.executeScript("arguments[0].click();", element1);
		}
		
		try {
			executor.executeScript("arguments[0].click();", element2);
		} catch (Exception e) {
			executor.executeScript("arguments[0].click();", element2);
		}
		
		try {
			executor.executeScript("arguments[0].click();", element3);
		} catch (Exception e) {
			executor.executeScript("arguments[0].click();", element3);
		}
		
		try {
			executor.executeScript("arguments[0].click();", element4);
		} catch (Exception e) {
			executor.executeScript("arguments[0].click();", element4);
		}
		
		try {
			executor.executeScript("arguments[0].click();", element5);
		} catch (Exception e) {
			executor.executeScript("arguments[0].click();", element5);
		}
		
		try {
			executor.executeScript("arguments[0].click();", element6);
		} catch (Exception e) {
			executor.executeScript("arguments[0].click();", element6);
		}
		
		driver.findElement(buttonNext).click();
		
	}
}
