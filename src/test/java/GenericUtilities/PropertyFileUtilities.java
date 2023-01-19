package GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author BasuBK
 *
 */
public class PropertyFileUtilities {
	public static String PropertyReader(String KeyValue) throws IOException  {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData1.xlsx");
		Properties property=new Properties();
		property.load(fis);
		String Value = property.getProperty(KeyValue);
		return Value;
	}
		
		
}
