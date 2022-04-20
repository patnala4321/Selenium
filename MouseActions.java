import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32_100\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		

		// WebElement
		// element=driver.findElement(By.xpath("//a[@id=\"menu_pim_viewPimModule\"]/b"));

		WebElement element = driver.findElement(By.linkText("PIM"));

		Actions action = new Actions(driver);
		

		action.moveToElement(element).click().perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		driver.quit();

	}

}
