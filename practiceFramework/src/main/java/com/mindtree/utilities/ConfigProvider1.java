package com.mindtree.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.mindtree.exception.FileInputException1;

public class ConfigProvider1 {
	static Properties props=new Properties();
	public ConfigProvider1() throws IOException
	{
		File configFilePath=new File("./testdata/config.properties");
		FileInputStream configFile;
		try {
			configFile=new FileInputStream(configFilePath);
			props.load(configFile);
		}catch(FileNotFoundException e) {
			FileInputException1.fileNotFoundException(e);
		}catch(IOException e)
		{
			FileInputException1.exception(e);
		}
	}

}
