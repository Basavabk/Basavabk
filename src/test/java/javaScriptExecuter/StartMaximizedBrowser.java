package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartMaximizedBrowser {

	

	public static void main(String[]args)  {
		
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		//driver.manage().window().maximize();
		driver.get("https:/yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
