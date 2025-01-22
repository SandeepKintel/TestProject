package AmazonTestPackage.AmazonTestProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelWindows {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		WebElement point = driver.findElement(By.xpath("//div[@data-id='1eee9c6']"));
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", point);
		Thread.sleep(2000);
		String ParentWindow= driver.getWindowHandle();
		System.out.println("Parent window Id is " + ParentWindow);
		Actions action = new Actions(driver);
		action.moveToElement(point).perform();
		driver.get("https://grotechminds.com/window-handle-and-handles/");
		driver.findElement(By.xpath("//div[@data-id=\"d27c28f\"]/div/div/button")).click();
		//driver.findElement(By.xpath("//div[@data-id=\"4688ffd\"]/div/div/button")).click();
		Set<String> Allhandles= driver.getWindowHandles();
		System.out.println(Allhandles);
		
		Iterator<String> i1 = Allhandles.iterator();
		while(i1.hasNext())
		{
			String handle=i1.next();
			if(!handle.equals(ParentWindow))
			{
				Thread.sleep(2000);
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(ParentWindow);
		
		
		
		
		
				
	}

}
