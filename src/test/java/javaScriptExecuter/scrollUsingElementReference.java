package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollUsingElementReference {
	public static void main(String[]args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement toys = driver.findElement(By.xpath("//h2[@class='a-color-base headline truncate-2line']"));	
     Point location = toys.getLocation();
     int x = location.getX();
     int y = location.getY();
     
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("Window.scrollBy("+x+","+y+")");
	
	Thread.sleep(3000);
	
	driver.quit();
	
}
}
