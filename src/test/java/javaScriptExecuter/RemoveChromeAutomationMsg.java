package javaScriptExecuter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveChromeAutomationMsg {
	
	ChromeOptions option = new ChromeOptions();
	option.setExperimentaloption("excludeSwtiches", new String[] {"enable-automation"});

	WebDriver driver = new ChromeDriver(option);
}
