package ZZ.com.java.ZZ.com.java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Testngprac {
	
	static ExtentTest test;
	static ExtentReports report;


	
		@BeforeClass
		public void test() {
			
			report = new ExtentReports(("/Users/lakshtisharma/eclipse-workspace/ZZ.com.java/ExtendReport")+"ExtentReportResults.html");
			test = report.startTest("ExtentDemo");

		}
		@Test
		public void runfirsttest() {
			System.out.println("Hello");
			
		}
		@AfterClass
		public void testclose() {
			report.endTest(test);
			report.flush();
			
			
		} 

	



}

