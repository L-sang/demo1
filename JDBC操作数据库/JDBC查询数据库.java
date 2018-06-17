package cn.itcast.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 *JDBC��������ѯ���ݱ���ȡ����� 
 */
public class JDBCDemo1 {

	public static void main(String[] args)throws Exception {
	  //1.ע������
		Class.forName("com.mysql.jdbc.Driver");
		//2.��ȡ���Ӷ���
		String url="jdbc:mysql://localhost:3306/mybase";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, username, password);
		//��ȡִ��SQL���Ķ���
		Statement stat=con.createStatement();
		//ƴд��ѯ��SQL
		String sql="select *from sort";
		//4.����ִ���߶��󷽷�,ִ��SQL����ȡ�����
		//ResultSet executeQuery(String sql) ִ��SQL����е�select��ѯ
		//����ֵResultSet�ӿڵ�ʵ�������,ʵ������mysql������
		ResultSet rs=stat.executeQuery(sql);
		//5.��������
		//ResultSet�ӿڷ���boolean next()����true,�н����,����false,û�н����
		while(rs.next()) {
			//��ȡÿ�е�����,ʹ�õ���ResultSet�ӿڵķ���getXXX����������,����дString����
			System.out.println(rs.getInt("sid")+" "+rs.getString("sname")+" "
			+rs.getDouble("sprice")+" "+rs.getString("sdesc"));
			}
		
		
		
		rs.close();
		stat.close();
		con.close();
		
	}

}
