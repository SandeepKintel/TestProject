package AmazonTestPackage.AmazonTestProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchProductTestCase extends AmazonLaunchAndQuit{
	
	@Test(retryAnalyzer=AmazonTestPackage.AmazonTestProject.RetryAnalyzerPro.class)
	public void SearchProduct() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AmazonShoppingPage amzshp = new AmazonShoppingPage(driver);
		amzshp.searchProduct("Pen");
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		Thread.sleep(2000);
		System.out.println(li.size());
		li.get(4).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		
	
		
		
	
	}
	
}
