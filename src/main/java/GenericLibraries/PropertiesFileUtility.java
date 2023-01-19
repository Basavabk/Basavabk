package GenericLibraries;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable methods related to actions performed  
 * @author BasuBK
 *
 */
public class PropertiesFileUtility {
	
	private Properties property;
	/**
	 * This method is used to initialize properties file
	 * @param path
	 */
	
	
	
	public void propertyFileInitialization(String path) {
		FileInputStream fis =null;
		try {
			fis= new FileInputStream(path);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	/**
	 * This method is used to fetch the data properties file
	 * @param key
	 * @return
	 */
	 public String fetchProperty(String key) {
		 return property.getProperty(key);
	 }
	 /**
	  * This method is used to modify properties file
	  * @param value
	  * @param path
	  * @param message
	  */
	 public void modifyPropertiesFile(String value,String path, String message) {
		 
		 FileOutputStream fos =null;
			try {
				fos= new FileOutputStream(path);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			property = new Properties();
			try {
				property.store(fos,message);
			}catch (IOException e) {
				e.printStackTrace();
			}
		 
	 }
	 
	 
}
	
	
