package ZZ.com.java.ZZ.com.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Browser {
	private static Logger logger = LogManager.getLogger(Browser.class);

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.get("https://demoqa.com/modal-dialogs");
		
		logger.info("url is launched");
		 driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
        driver.manage().wait(5000);
         
        Alert alter = driver.switchTo().alert();
       String mesaage =  alter.getText();
       System.out.println(mesaage);
       alter.accept();
		
	}

		
	}


