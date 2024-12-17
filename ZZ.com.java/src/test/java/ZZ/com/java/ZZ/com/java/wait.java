package ZZ.com.java.ZZ.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
 		
 		//driver.findElement(By.xpath("//button[text()='Enable button after 10 seconds']")).click();
 		//Thread.sleep(12000);
 		//driver.findElement(By.xpath("//button[text()='button']")).click();

 		//checkbox
 		//driver.findElement(By.xpath("//button[@id()='disable']")).click();
 		//driver.findElement(By.xpath("//button[@id()='checkbox']")).click();
 		//Thread.sleep(10000);

 		driver.findElement(By.xpath("//button[text()='//button[text()='Click me, to Open an alert after 5 seconds']")).click();

 		
	}

}
