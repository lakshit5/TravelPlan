package ZZ.com.java.ZZ.com.java;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 		driver.get("https://www.demo.guru99.com/test/radio.html");
 		//List<String> data = new ArrayList<String>();
 		//data.add("selenium");
 		//driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
 		//driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

 		List<WebElement> listdrop=driver.findElements(By.xpath("//input[@type='radio']"));
 		
 		for (int i =0; i<listdrop.size();i++)
 		{
 			String datavalue =listdrop.get(i).getAttribute("value");
 			System.out.println(datavalue);
 			if (datavalue.equals("Option 1"))
 			{
 				listdrop.get(i).click();
 				break;
 			}
 			else {
 				System.out.println("No");
 			}
 		}
 		
 		
 		
	}}

