package ZZ.com.java.ZZ.com.java;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	
	@BeforeMethod
	public void launchbrowser() {
		System.out.println("befor method");
		
		
	}
		@Test
		public static void compareassert() {
			int d = 15/3;
			
			SoftAssert sc =new SoftAssert();
			AssertJUnit.assertEquals(d, 7);
		}
 		
		

 		
 		
	}
