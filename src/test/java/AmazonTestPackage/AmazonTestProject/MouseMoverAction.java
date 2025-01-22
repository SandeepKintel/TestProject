package AmazonTestPackage.AmazonTestProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoverAction {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/mousemover/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e1=driver.findElement(By.xpath("(//div[@class='elementor-heading-title elementor-size-default'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(e1).contextClick(e1).perform();
//		action.moveToElement(e1).click().perform();
		
	}

}
