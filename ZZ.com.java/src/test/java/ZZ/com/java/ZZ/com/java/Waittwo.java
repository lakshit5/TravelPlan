package ZZ.com.java.ZZ.com.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waittwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
 		
 		
		driver.findElement(By.xpath("//button[text()='Click me, to Open an alert after 5 seconds']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		//org.openqa.selenium.Alert alert  = driver.switchTo().alert();
		//String msg  = alert.getText();
		//System.out.println(msg);

		//driver.findElement(By.xpath("//button[@class='btn btn-primary'] ")).click();
		
}}
