package ZZ.com.java.ZZ.com.java;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
//import org.junit.Before;
import org.testng.*;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {

 		@BeforeMethod
	    public void beforeMethod(){
	      System.out.println("executing beforeMethod before each method");
	      
	      WebDriver driver = new ChromeDriver();
	 		driver.get("https://chercher.tech/java/explicit-wait-selenium");
	    }
		
 		@Test
		public void takescrenshoot() {
			System.out.println("i am first");
			
			
		}
		@Test
		public void takescrenshoot2() {
			System.out.println("i am second");

			
		}
		
		
	}


