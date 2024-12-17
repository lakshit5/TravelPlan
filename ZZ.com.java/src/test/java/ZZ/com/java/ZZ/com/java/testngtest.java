package ZZ.com.java.ZZ.com.java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistner.class) 
public class testngtest {
	@BeforeClass
	public void test() {
		
		
	}
	@Test
	public void runfirsttest() {
		AssertJUnit.assertEquals(5, 5);
		
		
		
	}
	@AfterClass
	public void testclose() {
		
	} 

}
