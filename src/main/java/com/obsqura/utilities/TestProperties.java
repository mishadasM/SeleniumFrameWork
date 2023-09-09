package com.obsqura.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	
	public static Properties GetProperties() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fil = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\ObsquraTestAutomationFramework\\src\\main\\resources\\Configuration\\Config.properties");
		prop.load(fil);
		return prop;
	}
}