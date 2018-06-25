package cn.itcast.gjp.service;

import java.util.List;

import cn.itcast.gjp.dao.ZhangWuDao;
import cn.itcast.gjp.domain.ZhangWu;

/*
 *业务层类
 *接收上一层,控制 层controller
 *经过计算,传递给dao层,操作数据库
 *调用dao层中的类,类成员位置.创建Dao类的对象
 */
public class ZhangWuService {
private ZhangWuDao dao=new ZhangWuDao();

/*
 * 定义方法,实现删除账务
 * 由控制层调用,传递主键id
 * 调用dao层方法,传递主键id
 */
public void deleteZhangWu(int zwid) {
	dao.deleteZhangWu(zwid);
}

/*
 *定义方法,实现编辑账务 
 * 由控制层调用,传递ZhangWu类型对象
 * 调用dao层方法,传递ZhangWu类型对象
 */
public void editZhangwu(ZhangWu zw) {
	dao.editZhangWu(zw);
}

/*
 *定义方法,实现添加账务 
 * 由控制层调用,传递ZhangWu类型对象
 * 调用dao层方法,传递ZhangWu类型对象
 */
public void addZhangWu(ZhangWu zw) {
	dao.addZhangWu(zw);
}


/*
 *定义方法,实现查询所有的账务数据 
 * 此方法,由控制层调用,去调用dao层方法
 */
public List<ZhangWu> selectAll() {
	return dao.selectAll();
}

/*
 * 定义方法,实现条件查询账务
 * 方法由控制层调用,传递两个日期的字符串
 * 调用dao层的方法,传递两个日期字符串,获取结果集
 * 结果集返回给控制层
 */
public List<ZhangWu> select(String startDate,String endDate){
	return dao.select(startDate, endDate);
}



}
