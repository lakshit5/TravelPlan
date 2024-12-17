package ZZ.com.java.ZZ.com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Model_diloge {

	public static void main(String[] args) {
 		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/modal-dialogs");
		
		driver.findElement(By.xpath("//button[text()='Small modal']")).click();
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		
		

	}

}
