package VtigerPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {
	public static void main(String[]args) throws IOException {
		//step1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/common.properties");
		
		//step2:create an instance properties class 
		//properties class is available in java.util package
		
		Properties p = new Properties();
		
		//step3: Load all keys-values pairs to properties object
		p.load(fis); //IOException
		
		//java concept involved- Map interface -HashTable
		
		//step4:Read data
		String url = p.getProperty("url");
		long time = Long.parseLong(p.getProperty("timeouts"));
		
		System.out.println(url+"\t"+time);		
		
	}

}
