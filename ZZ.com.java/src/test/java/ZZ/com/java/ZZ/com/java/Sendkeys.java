package ZZ.com.java.ZZ.com.java;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver ();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//driver.manage().wait(4000);
		
 		
		driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
		
 		
		
		org.openqa.selenium.Alert alert =driver.switchTo().alert();
 		String s = alert.getText();
 		System.out.println(s);
 		alert.sendKeys("i am testing");
		
		
	}

}
