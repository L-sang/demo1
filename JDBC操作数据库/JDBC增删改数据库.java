package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/*
 JDBC�������ݿ�Ĳ��� 
 * 1.ע������
 * ��֪JVMʹ�õ�����һ�����ݿ������
 * 2.�������
 * ʹ��JDBC�е�����ɶ�MySQL���ݿ������
 * 3.������ִ��ƽ̨
 * ͨ�����Ӷ����ȡ��SQL����ִ���߶���
 * 4.ִ��SQL���
 * ʹ��ִ���߶���,�����ݿ�ִ��SQL���
 * ��ȡ���ݿ�ִ�к�Ľ��
 * 5.������
 * 6.�ͷ���Դ һ��close()
 */
public class JDBCDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.ע������,���似��,���������뵽����
		//ע������
		//ʹ��java.sql.DriverManager�ྲ̬����registerDriver(Driver driver)
		//Driver��һ���˽ӿ�,��������,MySql���������е�ʵ����
		//DriverManager.registerDriver(new Driver());
		//������Դ����,ע����������
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.��ȡ���ݿ������ DriverManger���о�̬����
		//static Connection getConnection(String url,String user,String password)
		//����ֵ��Connection�ӿڵ�ʵ����,��mysql��������
		//url:���ݿ��ַ jdbc:mysql://��������IP:�˿ں�//���ݿ�����
		String url="jdbc:mysql://localhost:3306/mybase";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, username, password);
		
		
		//3.������ִ��ƽ̨,ͨ�����ݿ����Ӷ���,��ȡSQL����ִ���߶���
		//con������÷��� Statement createStatement() ��ȡStatement����,��SQL��䷢�͵����ݿ�
		//����ֵ��Statement�ӿڵ�ʵ�������,��MySQL��������
		Statement stat=con.createStatement();
		
		//ִ��SQL���
		//ͨ��ִ���߶�����÷���ִ��SQL���,��ȡ���
		// int executeUpdate(String sql)ִ�����ݿ��е�SQL���,insert delete update
		//����ֵint,�����ɹ����ݱ������
		int row=
				stat.executeUpdate("insert into sort(sid,sname,sprice,sdesc)values(7,'������Ʒ',500000,'����Ǽ�')");
		System.out.println(row);
		 
		//6.�ͷ���Դ һ��close()
		stat.close();
		con.close();
		
	}
	

}
