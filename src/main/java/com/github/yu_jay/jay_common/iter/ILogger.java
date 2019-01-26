package com.github.yu_jay.jay_common.iter;

/**
 * 日志管理器
 * @author yujie
 *
 */
public interface ILogger {

	/**
	 * 通过class 生成日志类
	 * @param clazz java类
	 * @return 日志对象
	 */
	Object getLogger(Class<?> clazz);
	
	/**
	 * 生成默认日志类
	 * @return 日志对象
	 */
	Object getLogger();
	
}
