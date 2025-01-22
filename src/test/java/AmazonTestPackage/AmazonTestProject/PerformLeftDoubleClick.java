package AmazonTestPackage.AmazonTestProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformLeftDoubleClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/left-double-click/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e1=driver.findElement(By.className("popup1"));
		Actions action = new Actions(driver);
		action.doubleClick(e1).perform();
	}

}
