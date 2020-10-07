package StepDefinition;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import com.nhs.pages.*;

public class EligibilityChecker {

	WebDriver driver = null;
	private HelpPage page;

	@Given("^I am a person from Wales$")
	public void i_am_a_person_from_Wales() throws Throwable {

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);

		// System.setProperty("webdriver.chrome.driver",projectPath+"/src/main/resources/drivers/chromedriver.exe");

		System.setProperty("webdriver.gecko.driver", projectPath + "/src/main/resources/drivers/geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);

		// driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");

		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		String title = driver.getTitle();
		System.out.println(title);

		String pageSource = driver.getPageSource();
		Assert.assertTrue(pageSource.contains("Although most NHS treatment is free, there is usually a charge for"));
		Assert.assertTrue(pageSource.contains("repairing or replacing glasses or contact lenses"));
		Assert.assertTrue(pageSource.contains("NHS dental check-ups and treatment"));
		Assert.assertTrue(
				pageSource.contains("You could be entitled to help with these costs depending on your circumstances."));
	}

	@When("^I put my circumstances into the Checker tool$")
	public void i_put_my_circumstances_into_the_Checker_tool() throws Throwable {

		page = new HelpPage(driver);
		page.clickOnStartButton();
		page.clickOnWalesRadioButton();
		page.clickNextButton();
		page.enterDateOfBirthDetails(30, 10, 1987);
		page.clickNextButton();
		page.clickOnNoPartnerRadioButton();
		page.clickNextButton();
		page.clickOnNoTaxCreditButton();
		page.clickNextButton();
		page.clickOnNotGivenBirthNoRadioButton();
		page.clickNextButton();
		page.clickOnNoinjuryRadioButton();
		page.clickNextButton();
		page.clickOnNodiabetesRadioButton();
		page.clickNextButton();
		page.clickOnNoglaucomaRadioButton();
		page.clickNextButton();
		page.clickOnNoIncareHomeRadioButton();
		page.clickNextButton();
		page.clickOnNoSavingsRadioButton();
		page.clickNextButton();

	}

	@Then("^I should get a result of whether I will get help or not$")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		String actualResult = page.VerifyBasedOnWhatYouToldUsText();
		String expectedResult = "Based on what you've told us";
		Assert.assertEquals(expectedResult, actualResult);

		driver.getPageSource().contains("If your prescription is dispensed in Wales or you have an Entitlement Card");
		driver.getPageSource().contains("How to get your help");
		driver.getPageSource().contains("If your GP is in England");
		driver.getPageSource().contains("How to apply for an Entitlement Card");
		driver.getPageSource().contains("You could be entitled to further help depending on your circumstances");

		driver.getPageSource().contains("You can apply for help to pay for your NHS costs.");
		driver.getPageSource().contains("You don't have to be claiming benefits to apply.");
		driver.getPageSource().contains("You may also get help paying for:");
		driver.getPageSource().contains("NHS prescriptions");
		driver.getPageSource().contains("NHS dental check-ups and treatment");

	}

}
