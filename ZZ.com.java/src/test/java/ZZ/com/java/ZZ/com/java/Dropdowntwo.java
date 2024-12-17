package ZZ.com.java.ZZ.com.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Dropdowntwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/newtours/register.php");	
		
 		List<WebElement> listdrop =driver.findElements(By.xpath("//select[@name='country']"));

  		
		

	}

}
