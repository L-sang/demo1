package cn.itcast.gjp.controller;

import java.util.List;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.service.ZhangWuService;

/*
 * ��������
 * ������ͼ�������,�����ݴ��ݸ�service��
 * ��Աλ��,����service����
 */
public class ZhangWuController {
private ZhangWuService service=new ZhangWuService();

/*
 * ���巽��,ʵ��ɾ�������� 
 * ����ͼ�����,����int��������
 * ����service��ķ���,����int����
 */
public void deleteZhangWu(int zwid) {
	service.deleteZhangWu(zwid);
}

/*
 *���巽��,ʵ�ֱ༭������ 
 * ����ͼ�����,���ݲ���,Ҳ��ZhangWu����
 * ����service��ķ���,����ZhangWu����
 */
public void editZhangWu(ZhangWu zw) {
	service.editZhangwu(zw);
}

/*
 *���巽��,ʵ��������� ����
 *����ͼ�����,���ݲ���(���ݹ����Ĳ���������5������,���ݵ���1��ZhangWu���͵Ķ���)
 *��������service��ķ���,����ZhangWu����,��ȡ��Ӻ�Ľ����(��ӳɹ�������,int)
 */
public void addZhangWu(ZhangWu zw) {
	service.addZhangWu(zw);
}


/*
 * ���巽��,ʵ��������ѯ����
 * ��������ͼ�����,�����������ڵ��ַ���
 * ����service��ķ���,�������������ַ���,��ȡ�����
 * ��������ظ���ͼ��
 */
public List<ZhangWu>select(String startDate,String endDate){
	return service.select(startDate, endDate);
}

/*
 * ���Ʋ㶨�巽��,ʵ�ֲ�ѯ���е���������
 * ��������ͼ�����.��������service��
 */
public List<ZhangWu> selectAll() {
	return service.selectAll();
}


}
