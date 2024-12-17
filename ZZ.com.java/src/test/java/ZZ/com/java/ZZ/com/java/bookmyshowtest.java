package ZZ.com.java.ZZ.com.java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class bookmyshowtest {
	{
	        WebDriver driver = new ChromeDriver();
 			driver.manage().window().maximize();
			//driver.get("https://www.google.com/");
			driver.get("https://in.bookmyshow.com/explore/home/mumbai");

 	        WebElement eventsTab = driver.findElement(By.xpath("//a[text()='Events']"));
	            eventsTab.click();

	            // Wait for the Events page to load
	            //Thread.sleep(5000); // Use WebDriverWait for better practice

	            // Select 'Comedy' from the options
	            WebElement comedyOption = driver.findElement(By.xpath("//div[text()='Comedy Shows']"));
	            comedyOption.click();

	            // Wait for the Comedy Shows page to load

	            // Fetch all the results displayed on the page
	            List<WebElement> comedyShows = driver.findElements(By.xpath("//div[contains(@class, 'card-details')]"));

	            // Print out the details of each comedy show
	            for (WebElement show : comedyShows) {
	                String showName = show.findElement(By.tagName("h4")).getText();
	                String showDetails = show.findElement(By.tagName("p")).getText();
	                System.out.println("Show Name: " + showName);
	                System.out.println("Details: " + showDetails);
	                System.out.println("-----------");
	         
	        }
	    }
	
}
