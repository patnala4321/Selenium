import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelNames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32_100\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();

		WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
		pim.click();

		// //form[@id='search_form']/fieldset/ol/li[2]/label

		WebElement menu = driver.findElement(By.id("search_form"));
		List<WebElement> labelNames = menu.findElements(By.xpath("//form[@id='search_form']/fieldset/ol/li/label"));
		int labelNamesCount = labelNames.size();

		System.out.println("li " + labelNamesCount);

		System.out.println("Label Names ");
		for (WebElement ele : labelNames)

		{
			System.out.println(ele.getText());
		}

		List<WebElement> textBoxNames = menu.findElements(By.xpath("//form[@id='search_form']/fieldset/ol/li/input"));
		int textBoxNamesCount = labelNames.size();

		System.out.println("li " + textBoxNamesCount);
		System.out.println("TextBox Names");

		for (WebElement ele : textBoxNames)

		{
			System.out.println(ele.getAttribute("id"));
		}

		driver.findElement(By.xpath("//a[@id='welcome']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		driver.quit();

	}

}
