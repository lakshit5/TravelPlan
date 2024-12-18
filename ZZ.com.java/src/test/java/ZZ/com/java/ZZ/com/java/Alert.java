package ZZ.com.java.ZZ.com.java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		//engg 1 modify
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
		
		driver.manage().wait(2000);
		
		
		org.openqa.selenium.Alert alert =driver.switchTo().alert();
 		String s = alert.getText();
 		System.out.println(s);
 		alert.accept();
 		
 		
		
	}

}
