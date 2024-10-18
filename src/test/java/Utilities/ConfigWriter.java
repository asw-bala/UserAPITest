package Utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigWriter {
	public void loadWriteConfig(String key, String value) throws Throwable {
		String propertyWriteFilePath = "./src/test/resources/config/writeconfig.properties";;

		try {
			 
			FileOutputStream fos = new FileOutputStream(propertyWriteFilePath,true);
			
			Properties prop = new Properties();		
			
			prop.setProperty(key, value);
			prop.store(fos, null);
			//fos.close();

			try {
				//prop.store(fos,null);
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at config file path " + propertyWriteFilePath);
		}
	}


}
