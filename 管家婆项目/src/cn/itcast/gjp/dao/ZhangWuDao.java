package cn.itcast.gjp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.tools.JDBCUtils;


/*
 * ʵ�ֶ����ݱ�gjp_zhangwu ������ɾ�Ĳ����
 * dbutils���������,���Ա����QueryRunner����,ָ������Դ
 */
public class ZhangWuDao {
private QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());

/*
 * ���巽��,ʵ��ɾ�������� 
 * ��ҵ������,��������id
 * 
 */
public void deleteZhangWu(int zwid) {
	try {
		//ɾ������SQL���
		String sql="delete from gjp_zhangwu where zwid=?";
		qr.update(sql,zwid);
	}catch(SQLException ex) {
		System.out.println(ex);
		throw new RuntimeException("ɾ������ʧ��");
	}
}

/*
 * ���巽��,ʵ�ֱ༭������ 
 * ��ҵ������,����ZhangWu���Ͷ���
 * �������е�����,���µ����ݱ�
 */
public void editZhangWu(ZhangWu zw) {
	try {
	//�������ݵ�SQL���
	String sql="update gjp_zhangwu set flname=?,money=?,zhanghu=?,createtime=?,description=? where zwid=?";
	//�����������,�����в�����������
	Object[]params={zw.getFlname(),zw.getMoney(),zw.getZhanghu(),
			zw.getCreatetime(),zw.getDescription(),zw.getZwid()};
	//����qr���󷽷�updateִ�и���
	qr.update(sql,params);
	}catch(SQLException ex) {
		System.out.println(ex);
		throw new RuntimeException("����༭ʧ��");
	}
}


/*
 * ���巽��,ʵ��������� 
 * ��ҵ������,����ZhangWu���Ͷ���
 * ��ZhangWu�����е�����,��ӵ����ݱ�
 */
public void addZhangWu(ZhangWu zw) {
	try {
	//ƴд������ݵ�SQL���
		String sql="insert into gjp_zhangwu (flname,money,zhanghu,createtime,description)values(?,?,?,?,?)";
		//������������,�洢5��ռλ����ʵ�ʲ���
		//ʵ�ʲ�����Դ��,���ݹ����Ķ���ZhangWu
		Object[]params= {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),
				zw.getCreatetime(),zw.getDescription()};
		//����qr�����еķ���updateִ�����
		qr.update(sql, params);
	}catch(SQLException ex) {
		System.out.println(ex);
		throw new RuntimeException("�������ʧ��");
	}
}


/*
 * ���巽��,��ѯ���ݿ�,����������ѯ�������� 
 * ������ҵ������,��ѯ������洢��Bean����,�洢��List����
 * �����ߴ���2�����ڵ��ַ���
 */
public List<ZhangWu>select(String startDate,String endDate){
	try {
	//ƴд������ѯ��SQL���
		String sql="SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
		//�����������,�洢?ռλ��
		Object[]params= {startDate,endDate};
		//����qr����ķ���query��ѯ���ݱ�,��ȡ�����
		return qr.query(sql, new BeanListHandler<>(ZhangWu.class),params);
	}catch(SQLException ex) {
		System.out.println(ex);
		throw new RuntimeException("������ѯʧ��");
	}

}

/*
 *���巽��,��ѯ���ݿ�,��ȡ���е��������� 
 * ����,��ҵ������
 */
public List<ZhangWu> selectAll() {
	    try {
	    //��ѯ�������ݵ�SQL���
			String sql="select * from gjp_zhangwu";
			//����qr����,query����,�����BeanListHandler
			List<ZhangWu> list=	qr.query(sql,new BeanListHandler<>(ZhangWu.class));
			return list;
		}catch(SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("��ѯ��������ʧ��");
		}
 
}







}
