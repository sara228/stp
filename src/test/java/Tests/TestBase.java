package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {

	public static WebDriver driver;
	
	@BeforeSuite
	@Parameters(("browser"))
	public void StartDriver(@Optional("chrome") String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Downloads\\chromedriver.exe");	
		driver = new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Downloads\\geckodriver.exe");	
		driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.expedia.com");
		driver.manage().timeouts().implicitlyWait(1200,TimeUnit.SECONDS);

		//driver.manage().timeouts().implicitlyWait(960,TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void StopDriver()
	{
		driver.quit();
	}
}
