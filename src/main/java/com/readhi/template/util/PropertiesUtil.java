package com.readhi.template.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	public static Properties getResources(String filename) {
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(filename);
		Properties prop = new Properties();
		try {
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return prop;
	}

	public static void main(String[] args) throws IOException {
		Properties prop = PropertiesUtil.getResources("-.properties");
		System.out.println(prop.getProperty("-"));
	}

}
