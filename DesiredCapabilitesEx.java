import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilitesEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32_100\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

//		driver.manage().window().maximize(); (Alternate for this method is below
		
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		ChromeDriver driver = new ChromeDriver(options);

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@id='welcome']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		driver.quit();

	}

}
