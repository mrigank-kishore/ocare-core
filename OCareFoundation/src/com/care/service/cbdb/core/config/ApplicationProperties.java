package com.care.service.cbdb.core.config;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApplicationProperties {
	
	private static final Logger log = LogManager.getLogger("ApplicationProperties");
	private static Configuration config = null;

	private ApplicationProperties()	{

	}

	static{
		try	{
			Configurations configs = new Configurations();
			config = configs.properties(new File("src/com/care/service/cbdb/core/config/config.properties"));
		}
		catch (ConfigurationException cex)	{
			System.err.println(cex.getMessage());
		}
	}

	public static String getProperty(String key)	{
		return config.getString(key);
	}
	
	public static List<String> getList(String key)	{
		return Arrays.asList(config.getStringArray(key));
	}

	public static void main(String[] args) {
		//Gson gson = new Gson();
		log.fatal(getList("nodes"));
	}
}
