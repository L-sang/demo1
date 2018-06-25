package cn.itcast.gjp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.tools.JDBCUtils;


/*
 * 实现对数据表gjp_zhangwu 数据增删改查操作
 * dbutils工具类完成,类成员创建QueryRunner对象,指定数据源
 */
public class ZhangWuDao {
private QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());

/*
 * 定义方法,实现删除账务功能 
 * 由业务层调用,传递主键id
 * 
 */
public void deleteZhangWu(int zwid) {
	try {
		//删除语句的SQL语句
		String sql="delete from gjp_zhangwu where zwid=?";
		qr.update(sql,zwid);
	}catch(SQLException ex) {
		System.out.println(ex);
		throw new RuntimeException("删除账务失败");
	}
}

/*
 * 定义方法,实现编辑账务功能 
 * 由业务层调用,传递ZhangWu类型对象
 * 将对象中的数据,更新到数据表
 */
public void editZhangWu(ZhangWu zw) {
	try {
	//更新数据的SQL语句
	String sql="update gjp_zhangwu set flname=?,money=?,zhanghu=?,createtime=?,description=? where zwid=?";
	//定义对象数组,将所有参数放入数组
	Object[]params={zw.getFlname(),zw.getMoney(),zw.getZhanghu(),
			zw.getCreatetime(),zw.getDescription(),zw.getZwid()};
	//调用qr对象方法update执行更新
	qr.update(sql,params);
	}catch(SQLException ex) {
		System.out.println(ex);
		throw new RuntimeException("账务编辑失败");
	}
}


/*
 * 定义方法,实现添加账务 
 * 由业务层调用,传递ZhangWu类型对象
 * 将ZhangWu对象中的数据,添加到数据表
 */
public void addZhangWu(ZhangWu zw) {
	try {
	//拼写添加数据的SQL语句
		String sql="insert into gjp_zhangwu (flname,money,zhanghu,createtime,description)values(?,?,?,?,?)";
		//创建对象数组,存储5个占位符的实际参数
		//实际参数来源是,传递过来的对象ZhangWu
		Object[]params= {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),
				zw.getCreatetime(),zw.getDescription()};
		//调用qr对象中的方法update执行添加
		qr.update(sql, params);
	}catch(SQLException ex) {
		System.out.println(ex);
		throw new RuntimeException("账务添加失败");
	}
}


/*
 * 定义方法,查询数据库,带有条件查询账务数据 
 * 方法由业务层调用,查询结果集存储到Bean对象,存储到List集合
 * 调用者传递2个日期的字符串
 */
public List<ZhangWu>select(String startDate,String endDate){
	try {
	//拼写条件查询的SQL语句
		String sql="SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
		//定义对象数组,存储?占位符
		Object[]params= {startDate,endDate};
		//调用qr对象的方法query查询数据表,获取结果集
		return qr.query(sql, new BeanListHandler<>(ZhangWu.class),params);
	}catch(SQLException ex) {
		System.out.println(ex);
		throw new RuntimeException("条件查询失败");
	}

}

/*
 *定义方法,查询数据库,获取所有的账务数据 
 * 方法,由业务层调用
 */
public List<ZhangWu> selectAll() {
	    try {
	    //查询账务数据的SQL语句
			String sql="select * from gjp_zhangwu";
			//调用qr方法,query方法,结果集BeanListHandler
			List<ZhangWu> list=	qr.query(sql,new BeanListHandler<>(ZhangWu.class));
			return list;
		}catch(SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("查询所有账务失败");
		}
 
}







}
