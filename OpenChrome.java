import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Softwares\\chromedriver_win32_100\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		// driver.get("https://www.google.co.in/");
		driver.get("https://www.facebook.com");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("xyz@yahoo.com");
		element = driver.findElement(By.id("pass"));
		element.sendKeys("aaaaaa");
		element = driver.findElement(By.name("login"));
		element.click();

	}

}
