package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
 public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/webhp");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[1]/a[1]")).click();
		//driver.navigate().back();
		//driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[1]/a[2]")).click();
		//driver.navigate().back();
		//driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[1]/a[3]")).click();
		//driver.navigate().back();
		//driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[1]/a[4]")).click();
		//driver.navigate().back();
		//driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/a[1]")).click();
		//driver.navigate().back();
		//driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/a[2]")).click();
		//driver.navigate().back();
		//driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/span/span/g-popup/div[1]/div")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("oracel");
		driver.findElement(By.xpath("//*[@id=\"jZ2SBf\"]/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	}

}
