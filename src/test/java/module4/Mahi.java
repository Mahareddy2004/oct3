package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mahi {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/webhp");
		driver.manage().window().maximize();
		WebElement obj =driver.findElement(By.xpath("//*[@id='APjFqb']"));
		obj.click();
		obj.sendKeys("facebook");
		//driver.findElement(By.xpath("//div[@id='jZ2SBf']")).click();
		driver.findElement(By.xpath("//div[@id='ERWdKc']")).click();
		driver.findElement(By.xpath("//h3[text()='Facebook - log in or sign up']")).click();
		driver.findElement(By.id("email")).sendKeys("peramm430@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Mahesh@122");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}
}
