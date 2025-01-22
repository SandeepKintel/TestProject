package AmazonTestPackage.AmazonTestProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/add-to-cart/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement form=driver.findElement(By.xpath("//form[@id='myForm']"));
		driver.switchTo().frame(form);
		driver.findElement(By.id("firstName")).sendKeys("sandeep");
		driver.findElement(By.id("lastName")).sendKeys("kumar");
	
		
		
	}

}
