package AmazonTestPackage.AmazonTestProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlePopUp {
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement popup = driver.findElement(By.xpath("//div[@data-id='743cc5a']"));
		Actions action = new Actions(driver);
		action.moveToElement(popup).perform();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.findElement(By.xpath("//button[@class='btnjs']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
	}

}
