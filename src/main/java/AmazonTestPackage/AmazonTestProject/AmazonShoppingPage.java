package AmazonTestPackage.AmazonTestProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonShoppingPage {
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement SearchField;
	
	public void searchProduct(String data)
	{
		SearchField.sendKeys(data);
	}
	
	
	public AmazonShoppingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
