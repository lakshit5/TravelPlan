package ZZ.com.java.ZZ.com.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTO {

	public static void main(String[] args) {
 
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Alert alert =driver.switchTo().alert();
		String message =alert.getText();
		System.out.println(message);
		alert.accept();
		
		
		 //driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
        //driver.manage().wait(5000);
      // driver.findElement(By.xpath("//input[@name='submit']")).click();
       
	}

}
