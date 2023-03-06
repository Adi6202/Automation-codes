package assignment;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneS5 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform(); 
		
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[3]/div/ul/li[1]/div/ul/li[2]/a")).click();
		
		Thread.sleep(2000);
		WebElement target1 = driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"));
		Actions act1=new Actions(driver);
		act.moveToElement(target1).perform(); 
		
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
	}
}
