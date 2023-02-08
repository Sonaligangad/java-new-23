package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\CLASS NOTES\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys("sonali");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("Sonali@123");
		WebElement login = driver.findElement(By.name("submit"));
		login.click();
		
		
		
		
	}

}
