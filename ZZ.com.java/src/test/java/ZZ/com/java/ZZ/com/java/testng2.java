package ZZ.com.java.ZZ.com.java;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng2 {
	
	@Test
	public void runfirstmethod() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@Test
	public void runsecondmethod() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bhaskar.com/");
	
	}

}
