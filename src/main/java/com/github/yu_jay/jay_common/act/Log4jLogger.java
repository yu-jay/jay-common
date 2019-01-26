package com.github.yu_jay.jay_common.act;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.github.yu_jay.jay_common.iter.ILogger;

/**
 * log4j 日志管理器
 * @author yujie
 *
 */
public class Log4jLogger implements ILogger {
	
	//default log name
	private final static String DEFAULT_lOGGER_NAME = "defaultLoggerName";

	/**
	 * 构造方法
	 */
	public Log4jLogger(String configPath) {
		Properties properties = new Properties(configPath);
		java.util.Properties pro = properties.getProperties();
		if(null != pro) {
			PropertyConfigurator.configure(pro);
		}
	}

	@Override
	public Logger getLogger(Class<?> clazz) {
		return Logger.getLogger(clazz);
	}

	@Override
	public Logger getLogger() {
		return Logger.getLogger(DEFAULT_lOGGER_NAME);
	}

}
