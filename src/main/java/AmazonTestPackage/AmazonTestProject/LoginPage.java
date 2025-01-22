package AmazonTestPackage.AmazonTestProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='nav-logo']")
	WebElement AmazonLogo;
	
	@FindBy(xpath="//div[@class='nav-line-1-container']")
	WebElement AccountList;
	
	@FindBy(xpath="(//a[@class='nav-action-signin-button'])[2]")
	WebElement SignIn;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement EmailField;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement ContinueButton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement PasswordField;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement SignInSubmitButton;
	

	
	public void verifyLogo()
	{
		AmazonLogo.isDisplayed();
	}
	
	public void clickSignIn()
	{
		SignIn.click();	
	}
	
	public void EnterEmail(String email)
	{
		EmailField.sendKeys(email);
	}
	
	public void ClickContinueButton()
	{
		ContinueButton.click();
	}
	
	public void EnterPassword(String password)
	{
		PasswordField.sendKeys(password);
	}
	
	public void ClickSubmitButton()
	{
		SignInSubmitButton.click();
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
