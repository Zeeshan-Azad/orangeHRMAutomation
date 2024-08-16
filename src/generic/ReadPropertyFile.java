package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {
	
	public static Properties propertiesObject;
	
	public static String initiatializeProperteisObjectAndDefinePage(String keyRequired) {
		
		String valueOfKey = null;
		
		
		if (propertiesObject == null) {
            propertiesObject = new Properties();
		}
		try {
	            FileInputStream fis = new FileInputStream("./filesToUse/config.properties");
	            propertiesObject.load(fis);		
			}
		catch (Exception e) {
			System.out.println("No Property file exists at given location");
			e.printStackTrace();
		}
		
		switch (keyRequired) {
		
		case "baseurl":
			valueOfKey = propertiesObject.getProperty(keyRequired);
			break;
			
		case "browser":
			valueOfKey = propertiesObject.getProperty(keyRequired);
			break;
			
		default:
			break;
		}
		
		return valueOfKey;
	}
}
