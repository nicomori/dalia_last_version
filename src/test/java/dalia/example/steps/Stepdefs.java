package dalia.example.steps;

import java.lang.invoke.MethodHandles;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dalia.example.pages.PageQuestions1;
import dalia.example.pages.PageQuestions2;
import dalia.example.pages.PageQuestions3;
import dalia.example.pages.PageQuestions4;
import dalia.example.pages.PageQuestions5;

public class Stepdefs {

	WebDriver driver;

	private static final String WIN_DRIVER_PATH = "src/test/resources/drivers/win/chromedriver.exe";
	private static final String MAC_DRIVER_PATH = "src/test/resources/drivers/mac/chromedriver";
	private static final String LINUX_DRIVER_PATH = "src/test/resources/drivers/linux/chromedriver";

	protected static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

	@Given("access to the chrome")
	public void access_to_the_chrome() {
		String oS = System.getProperty("os.name").toLowerCase();
			
		if (oS.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", WIN_DRIVER_PATH);

		} else if (oS.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", MAC_DRIVER_PATH);
		} else {
			logger.info("This is the OS: " + oS);
			logger.info("Starting the driver for Linux, " + oS);
			System.setProperty("webdriver.chrome.driver", LINUX_DRIVER_PATH);
		}

		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--js-flags=--expose-gc");
		options.addArguments("--enable-precise-memory-info");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-default-apps");
		options.addArguments("test-type=browser");
		options.addArguments("disable-infobars");
		options.addArguments("headless");
		options.addArguments("--disable-notifications");
		options.addArguments("window-size=1400,1024");

		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Point point = new Point(500, 4);
		driver.manage().window().setPosition(point);

		logger.info("driver created properly");
	}

	@Then("access to this url {string}")
	public void access_to_this_url(String url) {
		logger.info("access to the url: " + url);
		driver.get(url);
	}

	@Then("in the page {int}, make click in the checkbox and click in the button next")
	public void in_the_page_make_click_in_the_checkbox_and_click_in_the_button_next(Integer int1) {
		PageQuestions1 pageQuestions1 = new PageQuestions1(driver);
		pageQuestions1.makeClickInTheQuestionsAndPressNextInThePage1();
	}

	@Then("in the page {int}, select a radio button and click in the button next")
	public void in_the_page_select_a_radio_button_and_click_in_the_button_next(Integer int1) {
		PageQuestions2 pageQuestions2 = new PageQuestions2(driver);
		pageQuestions2.makeClickInTheQuestionsAndPressNextInThePage2();
	}

	@Then("in the page {int}, select {int} checkboxes and click in the button next")
	public void in_the_page_select_checkboxes_and_click_in_the_button_next(Integer int1, Integer int2) {
		PageQuestions3 pageQuestions3 = new PageQuestions3(driver);
		pageQuestions3.makeClickInTheQuestionsAndPressNextInThePage3();
	}

	@Then("in the page {int}, select {int} checkbox and click in the button next")
	public void in_the_page_select_checkbox_and_click_in_the_button_next(Integer int1, Integer int2) {

		PageQuestions4 pageQuestions4 = new PageQuestions4(driver);
		pageQuestions4.makeClickInTheQuestionsAndPressNextInThePage4();
	}

	@Then("in the page {int}, set some text, and click in the button next")
	public void in_the_page_set_some_text_and_click_in_the_button_next(Integer int1) {
		PageQuestions5 pageQuestions5 = new PageQuestions5(driver);
		pageQuestions5.makeClickInTheQuestionsAndPressNextInThePage5();
	}

	@Before
	public void setupBefore() {
		Properties log4jProp = new Properties();
		log4jProp.setProperty("log4j.rootLogger", "WARN");
		PropertyConfigurator.configure(log4jProp);

		PropertyConfigurator.configure(System.getProperty("user.dir") + "/log4j.properties");
	}

	@After
	public void afterMethod() {
		logger.info("Test completed starting closing the driver.");
		driver.close();
	}

}
