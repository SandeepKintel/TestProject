package AmazonTestPackage.AmazonTestProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends AmazonLaunchAndQuit
{
	
	@Test(dataProvider="inputvalue", retryAnalyzer=AmazonTestPackage.AmazonTestProject.RetryAnalyzerPro.class)
	public void LoginTest(String username, String password) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage lp= new LoginPage(driver);
		lp.clickSignIn();
		lp.EnterEmail(username);
		lp.ClickContinueButton();
		lp.EnterPassword(password);
		lp.ClickSubmitButton();
		Thread.sleep(10000);
		String Title= driver.getTitle();
		Assert.assertEquals(Title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@DataProvider(name="inputvalue")
	public Object[][] dataSet() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\sandeep.kumar\\eclipse-workspace\\AmazonTestProject\\datasheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1=w1.getSheet("creds");
		String username=s1.getRow(1).getCell(0).getStringCellValue();
		String password=s1.getRow(1).getCell(1).getStringCellValue();
		Object[][] data = new Object[1][2];
		data[0][0] = username;
		data[0][1] = password;
			
		return data;	
	}
}
