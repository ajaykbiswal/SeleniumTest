package jenkinsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoJenkinsJob {
	
	@Test
	public void jenkinsdemo(){
		
		System.out.println("Welcome to Jenkins World!");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
	}
	

}
