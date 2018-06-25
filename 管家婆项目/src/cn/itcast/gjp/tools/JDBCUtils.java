package cn.itcast.gjp.tools;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

/*
 *获取数据库连接的工具类 
 * 实现连接池,dbcp连接池
 */
public class JDBCUtils {
//创建BasicDataSource对象
	private static BasicDataSource datasource=new BasicDataSource();
	//静态代码块,实现 必要参数设置
	static {
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/gjp");
		datasource.setUsername("root");
		datasource.setPassword("root");
		datasource.setInitialSize(10);//初始化的连接数
		datasource.setMaxActive(10);//最大连接数量
		datasource.setMaxIdle(5);//最大空闲数
		datasource.setMinIdle(2);//最小空闲数
	}
	
	public static DataSource getDataSource() {
		return datasource;
	}
	
}
