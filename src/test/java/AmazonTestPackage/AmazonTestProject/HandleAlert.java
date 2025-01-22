package AmazonTestPackage.AmazonTestProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlert {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action  = new Actions(driver);
		WebElement AlertWindow = driver.findElement(By.xpath("(//div[@data-id='7d83396']/div/div/div/div/div/h3)[1]"));
		action.moveToElement(AlertWindow).perform();
		driver.get("https://grotechminds.com/alert/");
		driver.findElement(By.xpath("(//button[@class='bbb'])[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
	}

}
