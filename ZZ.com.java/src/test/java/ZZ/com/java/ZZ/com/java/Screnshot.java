package ZZ.com.java.ZZ.com.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screnshot {

	public static void main(String[] args) throws IOException {
 
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
	
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File file = sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("/Users/lakshtisharma/eclipse-workspace/ZZ.com.java/Screenshot/"+Math.random()+"Mytest.png"));
 
//		file, new File("D:\\flipkart\\screensahot\\"+Math.random()+"Mytest.png"));
		
		
	}

}
