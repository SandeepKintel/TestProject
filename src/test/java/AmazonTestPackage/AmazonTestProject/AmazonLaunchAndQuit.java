package AmazonTestPackage.AmazonTestProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(ItestListenerPro.class)
public class AmazonLaunchAndQuit extends ItestListenerPro {
	
	@Parameters("Environment")
	@BeforeTest
	public void LaunchAmazon(String Environment)
	{
		if(Environment.equals("chrome"))
		{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		}
		if(Environment.equals("edge"))
		{
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		}
		if(Environment.equals("firefox"))
		{
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		}
	}
	
	@AfterTest
	public void QuitAmazon() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.quit();
	}

}
