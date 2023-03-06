package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayS4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Apple watches"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='gh-cat']")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='15032']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

		
	}
}
