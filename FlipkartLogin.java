package mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Processor']")).click(); //processor DD
		driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Brand']")).click(); //Brand DD
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='HP']")).click();
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Operating System']")).click(); //OS DD
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Windows 10']")).click();
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Customer Ratings']")).click(); //rating DD
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='4★ & above']")).click();
		
		

	}

}
