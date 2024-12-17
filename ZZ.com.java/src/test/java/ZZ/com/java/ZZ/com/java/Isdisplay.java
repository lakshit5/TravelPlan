package ZZ.com.java.ZZ.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplay {

	public static void main(String[] args) {
 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 		driver.get("https://www.demo.guru99.com/test/newtours/register.php");
System.out.println(driver.findElement(By.xpath("//a[text()='Testing']"))); 	
	}
}
