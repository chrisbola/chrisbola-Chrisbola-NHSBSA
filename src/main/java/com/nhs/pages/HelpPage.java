package com.nhs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;


public class HelpPage extends BasePage {
	
	
	static WebDriver driver;
	private HelpPage check;
	
	
	
	
	@FindBy(id = "next-button") 
	 WebElement startButton;
	
	@FindBy(id = "label-wales") 
	 WebElement walesRadioButton;
	
	
	@FindBy(id = "next-button") 
	 WebElement NextButton;
	
	@FindBy(id = "label-no") 
	 WebElement noPartnerRadioButton;
	
	@FindBy(id = "label-no") 
	 WebElement noBenefitTaxCredit;
	
	@FindBy(id = "label-no") 
	 WebElement notGivenBirthButton;
	
	@FindBy(id = "label-no") 
	 WebElement NoinjuryRadioButton;
	
	@FindBy(id = "label-no") 
	 WebElement NodiabetesRadioButton;
	
	@FindBy(id = "label-no") 
	 WebElement NoglaucomaRadioButton;
	
	@FindBy(id = "label-no") 
	 WebElement NoIncareHomeRadioButton;
	
	@FindBy(id = "label-no") 
	 WebElement NohaveSavingsRadioButton;
	
	@FindBy(css = "#result-heading > span") 
	 WebElement basedOnWhatYouToldUsText;
	
	@FindBy(xpath = "//*[@id=\"result-heading\"]/text()") 
	 WebElement youGetHelpText;
	
	@FindBy(id = "FREE-heading") 
	 WebElement youGetFreeText;
	
	@FindBy(id = "wales-prescription-restriction") 
	 WebElement ifYourPrescriptionIsDispencedInWalesText;
	
	@FindBy(id = "dob-day") 
	 WebElement dobDay;
	
	@FindBy(id = "dob-month") 
	 WebElement dobMonth;
	
	@FindBy(id = "dob-year") 
	 WebElement dobYear;
	
	
	
	@FindBy(name = "RememberMe") 
	 WebElement RememberMeRadioButton;
	
	@FindBy(css = "#validationSummaryErrors > ul > li") 
	 WebElement InvalidLoginErrMsg;
	
	
public HelpPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	


	
	
	
	
	
	public void clickOnStartButton() {
		
		startButton.click();
		
	}
	
	
	public void clickOnWalesRadioButton() 
	{
		walesRadioButton.click();
	}
	
	
	
	
public void clickNextButton() {
	
	   NextButton.click();
		
		
	}

public void enterDateOfBirthDetails(int day, int month, int year) 
{
	String day1 = Integer.toString(day);
	String month1 = Integer.toString(month);
	String year1 = Integer.toString(year);
	dobDay.sendKeys(day1);
	dobMonth.sendKeys(month1);
	dobYear.sendKeys(year1);
	
	
	
	
}


public void clickOnNoPartnerRadioButton() {
	
	noPartnerRadioButton.click();
	
	
}

public void clickOnNoTaxCreditButton() {
	
	noBenefitTaxCredit.click();
}

public void clickOnNotGivenBirthNoRadioButton() {
	
	notGivenBirthButton.click();
	
	
}

public void clickOnNoinjuryRadioButton() {
	
	NoinjuryRadioButton.click();
}


public void clickOnNodiabetesRadioButton() {
	
	NodiabetesRadioButton.click();
}


public void clickOnNoglaucomaRadioButton() {
	
	NoglaucomaRadioButton.click();
}

public void clickOnNoIncareHomeRadioButton() {
	
	NoIncareHomeRadioButton.click();
}


public void clickOnNoSavingsRadioButton() {
	
	NohaveSavingsRadioButton.click();
}


public String VerifyBasedOnWhatYouToldUsText()
{
	return basedOnWhatYouToldUsText.getText();
}

public String verifyGetHelptext()
{
	return youGetHelpText.getText();
}

public boolean isYouGetFreeTextDisplayed() {
	
	return youGetFreeText.isDisplayed();
	
}

public boolean isYourPrescriptionDispencedInWalesTextDisplayed() 
{
	return ifYourPrescriptionIsDispencedInWalesText.isDisplayed();
}

	
	
	
	
	

}
