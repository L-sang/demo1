package cn.itcast.gjp.service;

import java.util.List;

import cn.itcast.gjp.dao.ZhangWuDao;
import cn.itcast.gjp.domain.ZhangWu;

/*
 *ҵ�����
 *������һ��,���� ��controller
 *��������,���ݸ�dao��,�������ݿ�
 *����dao���е���,���Աλ��.����Dao��Ķ���
 */
public class ZhangWuService {
private ZhangWuDao dao=new ZhangWuDao();

/*
 * ���巽��,ʵ��ɾ������
 * �ɿ��Ʋ����,��������id
 * ����dao�㷽��,��������id
 */
public void deleteZhangWu(int zwid) {
	dao.deleteZhangWu(zwid);
}

/*
 *���巽��,ʵ�ֱ༭���� 
 * �ɿ��Ʋ����,����ZhangWu���Ͷ���
 * ����dao�㷽��,����ZhangWu���Ͷ���
 */
public void editZhangwu(ZhangWu zw) {
	dao.editZhangWu(zw);
}

/*
 *���巽��,ʵ��������� 
 * �ɿ��Ʋ����,����ZhangWu���Ͷ���
 * ����dao�㷽��,����ZhangWu���Ͷ���
 */
public void addZhangWu(ZhangWu zw) {
	dao.addZhangWu(zw);
}


/*
 *���巽��,ʵ�ֲ�ѯ���е��������� 
 * �˷���,�ɿ��Ʋ����,ȥ����dao�㷽��
 */
public List<ZhangWu> selectAll() {
	return dao.selectAll();
}

/*
 * ���巽��,ʵ��������ѯ����
 * �����ɿ��Ʋ����,�����������ڵ��ַ���
 * ����dao��ķ���,�������������ַ���,��ȡ�����
 * ��������ظ����Ʋ�
 */
public List<ZhangWu> select(String startDate,String endDate){
	return dao.select(startDate, endDate);
}



}
