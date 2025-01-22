package AmazonTestPackage.AmazonTestProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(ItestListenerPro.class)
public class AmazonLaunchAndQuit extends ItestListenerPro {
	
	
	@BeforeTest
	public void LaunchAmazon()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void QuitAmazon() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.quit();
	}

}
