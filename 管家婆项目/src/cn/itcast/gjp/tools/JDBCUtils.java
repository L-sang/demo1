package cn.itcast.gjp.tools;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

/*
 *��ȡ���ݿ����ӵĹ����� 
 * ʵ�����ӳ�,dbcp���ӳ�
 */
public class JDBCUtils {
//����BasicDataSource����
	private static BasicDataSource datasource=new BasicDataSource();
	//��̬�����,ʵ�� ��Ҫ��������
	static {
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/gjp");
		datasource.setUsername("root");
		datasource.setPassword("root");
		datasource.setInitialSize(10);//��ʼ����������
		datasource.setMaxActive(10);//�����������
		datasource.setMaxIdle(5);//��������
		datasource.setMinIdle(2);//��С������
	}
	
	public static DataSource getDataSource() {
		return datasource;
	}
	
}
