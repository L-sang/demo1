package cn.itcast.demo2;

import java.sql.Connection;
import java.sql.PreparedStatement;

import cn.itcast.jdbcutil.JDBCUtils;

public class TestJDBCUtils1 {

	public static void main(String[] args)throws Exception {
		  Connection con=JDBCUtils.getConnection();
	      PreparedStatement pst=con.prepareStatement("insert into sort(sid,sname,sprice,sdesc)values(8,'汽车用品',500000,'疯狂涨价')");
	      pst.executeUpdate();
	      
	      JDBCUtils.close(con, pst);
	      
	}

}
