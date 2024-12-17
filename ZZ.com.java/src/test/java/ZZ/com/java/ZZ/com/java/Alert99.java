package ZZ.com.java.ZZ.com.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Alert99 {
	static WebDriver driver= new ChromeDriver();

	public static void main(String[] args) {
 		 

		
		
 		driver.get("https://demo.guru99.com/test/delete_customer.php");
 		driver.manage().window().maximize();
 		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Alert99 al=new Alert99();
		al.handleAlert();
 		
		
		
	}
	public void handleAlert() {
		driver.findElement((By.xpath("//input[@name='submit']"))).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		alert.dismiss();
		
		
		
		
	}

}
