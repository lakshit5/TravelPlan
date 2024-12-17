package ZZ.com.java.ZZ.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hadel_allert {

	public static void main(String[] args) {
 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.get("https://www.demo.guru99.com/test/guru99home/");

		//https://www.demo.guru99.com/test/guru99home/
 		
		//driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
		
 		
		//org.openqa.selenium.Alert alert = driver.switchTo().alert();
		//String alertText= alert.getText();
		//System.out.println(alertText);
		//alert.accept();
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//html/body/a/img")).click();
		
	}

}
