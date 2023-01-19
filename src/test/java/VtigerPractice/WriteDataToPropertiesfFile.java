package VtigerPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesfFile {
	public static void main(String[]args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/common.properties");
		Properties p = new Properties();
		p.load(fis);
		
		p.put("username", "basava");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/common.properties");
		p.store(fos,"Username Modified");
	}

}
