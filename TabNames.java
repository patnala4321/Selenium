import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabNames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32_100\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		 WebElement menu= driver.findElement(By.id("mainMenuFirstLevelUnorderedList"));
		    List<WebElement> buttonCount = menu.findElements(By.xpath("li"));
		   int liElementsCount=buttonCount.size();

		 //Using for loop
		   
		   System.out.println("Using for loop");
		WebElement tabName;
		for (int i = 1; i <= liElementsCount; i++) {
			tabName = driver.findElement(By.xpath("//ul[@id='mainMenuFirstLevelUnorderedList']/li["+i+"]/a/b"));
			System.out.println(tabName.getText());
		}
	
	
		//using for each loop
		
		 System.out.println("Using for each loop");
	   for(WebElement ele:buttonCount)
	   {
		   System.out.println(ele.getText());
	   }
		   

		driver.findElement(By.xpath("//a[@id='welcome']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		driver.quit();
	}

}
