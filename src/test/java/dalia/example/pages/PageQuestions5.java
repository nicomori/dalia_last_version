package dalia.example.pages;

import java.lang.invoke.MethodHandles;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageQuestions5 {

	WebDriver driver;
	protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());
	

	public PageQuestions5(WebDriver driver) {
		this.driver = driver;
	}

	// Variables section
	// Locator section
	By fieldToWriteTheAnswer = By.xpath("//*[contains(@class,'question_option')][1]/input");
	By buttonNext = By.xpath("(//button)[2]");

	// Method section
	/**
	 * this method make click in the questions and make click in the the button
	 * next.
	 * 
	 */
	public void makeClickInTheQuestionsAndPressNextInThePage5() {
		logger.info("Starting to send some value to some element");
		
		@SuppressWarnings("unused")
		WebElement myDynamicElement = (new WebDriverWait(driver, 20))
				.until(ExpectedConditions.presenceOfElementLocated(fieldToWriteTheAnswer));
		
		try {
			Thread.sleep(2222);
		} catch (Exception e) {
		}
		
		driver.findElement(fieldToWriteTheAnswer).sendKeys("this is and string example of the answer.");
		driver.findElement(buttonNext).click();
	}

}
