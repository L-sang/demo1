package cn.itcast.gjp.controller;

import java.util.List;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.service.ZhangWuService;

/*
 * 控制器层
 * 接收视图层的数据,将数据传递给service层
 * 成员位置,创建service对象
 */
public class ZhangWuController {
private ZhangWuService service=new ZhangWuService();

/*
 * 定义方法,实现删除账务功能 
 * 由视图层调用,传递int类型主键
 * 调用service层的方法,传递int主键
 */
public void deleteZhangWu(int zwid) {
	service.deleteZhangWu(zwid);
}

/*
 *定义方法,实现编辑账务功能 
 * 由视图层调用,传递参数,也是ZhangWu对象
 * 调用service层的方法,传递ZhangWu对象
 */
public void editZhangWu(ZhangWu zw) {
	service.editZhangwu(zw);
}

/*
 *定义方法,实现账务添加 功能
 *由视图层调用,传递参数(传递过来的参数不能是5个数据,传递的是1个ZhangWu类型的对象)
 *方法调用service层的方法,传递ZhangWu对象,获取添加后的结果集(添加成功的行数,int)
 */
public void addZhangWu(ZhangWu zw) {
	service.addZhangWu(zw);
}


/*
 * 定义方法,实现条件查询账务
 * 方法由视图层调用,传递两个日期的字符串
 * 调用service层的方法,传递两个日期字符串,获取结果集
 * 结果集返回给视图层
 */
public List<ZhangWu>select(String startDate,String endDate){
	return service.select(startDate, endDate);
}

/*
 * 控制层定义方法,实现查询所有的账务数据
 * 方法由视图层调用.方法调用service层
 */
public List<ZhangWu> selectAll() {
	return service.selectAll();
}


}
