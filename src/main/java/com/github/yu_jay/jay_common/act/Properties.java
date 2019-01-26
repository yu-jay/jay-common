package com.github.yu_jay.jay_common.act;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.github.yu_jay.jay_common.iter.IProperties;

/**
 * 加载.properties类型的配置文件
 * @author yujie
 *
 */
public class Properties implements IProperties {
	
	/**
	 * 属性
	 */
	private java.util.Properties properties = null;

	/**
	 * 构造
	 */
	public Properties(String configPath) {
		if(null != configPath && configPath.length() > 0) {
			File file = new File(configPath);
			if(file.exists()) {
				properties = new java.util.Properties();
		        try {
		        	properties.load(new FileInputStream(file));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public String getProperty(String key) {
		if(null != properties) {
			return properties.getProperty(key);
		}
		return null;
	}
	
	/**
	 * 获取属性本身
	 * @return
	 */
	public java.util.Properties getProperties() {
		return properties;
	}

}
