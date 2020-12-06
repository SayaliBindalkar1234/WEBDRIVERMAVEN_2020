package GitHubProjectForMaven.GitHubProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver ;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\my study stuff\\selenium driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void doLogin()
	{
		System.out.println("Execusting the test");
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kartikbindalkarit@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	}
	@AfterTest
	public void QuitDriver()
	{
		if (driver!=null)
			driver.close();
	}
}
