package ZZ.com.java.ZZ.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framclick {

	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 		driver.get("https://chercher.tech/practice/frames");
 		driver.switchTo().frame("frame1");
 		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
 		
 		driver.switchTo().frame("frame3");
 		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
 		
 		
 		driver.switchTo().parentFrame();
 		driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).sendKeys("test");
 		
 		
 		
		
	}

}
