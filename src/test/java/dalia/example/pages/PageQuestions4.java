package dalia.example.pages;

import java.lang.invoke.MethodHandles;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageQuestions4{

	WebDriver driver;
	protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());
	
	public PageQuestions4(WebDriver driver) {
		this.driver = driver;
	}

	// Variables section
	// Locator section
	By checkboxQuestion4 = By.xpath("//*[contains(@class,'question_option')][3]/input");
	By buttonNext = By.xpath("(//button)[2]");

	// Method section
	/**
	 * this method make click in the questions and make click in the the button next.
	 * 
	 */
	public void makeClickInTheQuestionsAndPressNextInThePage4() {
		logger.info("Starting to send some value of the username");
		
		@SuppressWarnings("unused")
		WebElement myDynamicElement = (new WebDriverWait(driver, 20))
				.until(ExpectedConditions.presenceOfElementLocated(checkboxQuestion4));
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		
		WebElement element2 = driver.findElement(checkboxQuestion4);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		try {
			executor.executeScript("arguments[0].click();", element2);
		} catch (Exception e) {
			executor.executeScript("arguments[0].click();", element2);
		}
		
		driver.findElement(buttonNext).click();
		
	}

}
