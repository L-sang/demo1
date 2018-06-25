package cn.itcast.gjp.view;
/*
 * ��ͼ��,�û������ĺͲ����Ľ���
 * ���ݴ��ݸ�controller��ʵ��
 * ��Աλ��,����controller����
 */

import java.util.List;
import java.util.Scanner;

import cn.itcast.gjp.controller.ZhangWuController;
import cn.itcast.gjp.domain.ZhangWu;

public class MainView {
private ZhangWuController controller=new ZhangWuController();
/*
 * ʵ�ֽ���Ч��
 * �����û�������
 * ��������,���ò�ͬ�Ĺ��ܷ���
 */
public void run() {
	//����Scanner�����,������������
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("------------�ܼ��ż������------------");
		System.out.println("1.������� 2.�༭���� 3.ɾ������ 4.��ѯ���� 5.�˳�ϵͳ");
		System.out.println("������Ҫ�����Ĺ������[1-5]:");
		//�����û��Ĳ˵�ѡ��
		int choose=sc.nextInt();
		//��ѡ��Ĳ˵��ж�,���ò�ͬ�Ĺ���
		switch(choose) {
		case 1:
		//ѡ���������,�����������ķ���
			addZhangWu();
			break;
		case 2:
		//ѡ��༭����,���ñ༭����ķ���
			editZhangWu();
			break;
		case 3:
		//ѡ��ɾ������,����ɾ������ķ���
			deleteZhangWu();
			break;
		case 4:
		//ѡ���ѯ����,���ò�ѯ����ķ���
			selectZhangWu();
			break;
		case 5:
		    System.exit(0);	
			
		}
		
	}
	
}
/*
 * ���巽��,ʵ������ ɾ��
 * ʵ��˼��:
 * �����û�������,����һ����������
 * ���ÿ��Ʋ�ķ���,����һ������
 */
public void deleteZhangWu() {
	//���ò�ѯ�����������ݵĹ���,��ʾ����
	//������������,����ѡ��һ��,����ɾ��
		selectAll();
		System.out.println("ѡ�����ɾ������,�������:");
		int zwid=new Scanner(System.in).nextInt();
		//���ÿ��Ʋ㷽��,��������id����
		controller.deleteZhangWu(zwid);
		System.out.println("ɾ������ɹ�");
}



/*���巽��,ʵ�ֶ�����ı༭���� 
 * ʵ��˼��:
 * �����û�������
 * ���ݵ���Ϣ,��װ��ZhangWu����
 * ���ÿ��Ʋ�ķ���,����ZhangWu����,ʵ�ֱ༭
 */
public void editZhangWu() {
	//���ò�ѯ�����������ݵĹ���,��ʾ����
	//������������,����ѡ��һ��,�����޸�
	selectAll();
	System.out.println("ѡ����Ǳ༭����,����������");
	Scanner sc=new Scanner(System.in);
	System.out.print("����ID:");
	int zwid=sc.nextInt();
	System.out.print("�����������:");
	String flname=sc.next();
	System.out.print("������:");
	double money=sc.nextDouble();
	System.out.print("�����˻�:");
	String zhanghu=sc.next();
	System.out.print("��������:��ʽXXXX-XX-XX");
	String createtime=sc.next();
	System.out.print("�����������:");
	String description=sc.next();
	//�������û����������,��װ��ZhangWu������
	//�û������idֵ,�����װ����
	ZhangWu zw  = new ZhangWu(zwid, flname, money, zhanghu, createtime, description);
	//����controller���еķ���ʵ�ֱ༭����
	controller.editZhangWu(zw);
	System.out.println("����༭�ɹ�");
}


/*
 *���巽�� addZhangWu
 *�������ķ���,�û��ڽ�����ѡ��˵�1��ʱ�����
 * ʵ��˼��:
 *   ���ռ�������,5������,����controller�㷽��
 */
public void addZhangWu() {
	System.out.println("ѡ������������Ĺ���,��������������");
	Scanner sc=new Scanner(System.in);
	System.out.println("�����������:");
	String flname=sc.next();
	System.out.println("������:");
	double money=sc.nextDouble();
	System.out.println("�����˻�:");
	String zhanghu=sc.next();
	System.out.println("��������:��ʽXXXX-XX-XX");
	String createtime=sc.next();
	System.out.println("�����������");
	String description=sc.next();
	//�����յ�������,����controller�㷽��,���ݲ���
	//���û���������в���,��װ��ZhangWu����
	ZhangWu zw=new ZhangWu(0, flname, money, zhanghu, createtime, description);
	controller.addZhangWu(zw);
	System.out.println("��ϲ,�������ɹ�!");
}


/*
 *���巽��selectZhangWu() 
 * ��ʾ��ѯ�ķ�ʽ1���в�ѯ2������ѯ
 * �����û���ѡ��
 */
public void selectZhangWu() {
	System.out.println("1.��ѯ���� 2.������ѯ");
	Scanner sc=new Scanner(System.in);
	int selectChooser=sc.nextInt();
	//�жϸ����û���ѡ��,���ò�ͬ�Ĺ���
	switch(selectChooser) {
	case 1:
		//ѡ��Ĳ�ѯ����,���ò�ѯ���еķ���
		selectAll();
		break;
	case 2:
		//ѡ���������ѯ,���ô���������ѯ�ķ���
		select();
		break;
	}
}
/*
 *���巽��,ʵ�ֲ�ѯ���еĲ�ѯ���������� 
 */
public void selectAll() {
	//���ÿ��Ʋ�ķ���,��ѯ���е���������
	List<ZhangWu>list=controller.selectAll();
	if(list.size()!=0)
		print(list);
		else
			System.out.println("û�в�ѯ������");


}

/*
 *���巽��,ʵ��������ѯ��������
 *�ṩ�û�����������,��ʼ����,��������
 *��2�����ڴ���controller��
 *���� controller�ķ���,�����������ڲ���
 *��ȡ��controller��ѯ�Ľ����,��ӡ����
 */
public void select() {
	System.out.println("ѡ��������ѯ,�������ڸ�ʽXXXX-XX-XX");
	Scanner sc=new Scanner(System.in);
	System.out.println("�����뿪ʼ����:");
	String startDate=sc.nextLine();
	System.out.println("�������������:");
	String endDate=sc.nextLine();
	//����controller��ķ���,��������,��ȡ��ѯ�����
	List<ZhangWu>list=controller.select(startDate, endDate);
	if(list.size()!=0)
	print(list);
	else
		System.out.println("û�в�ѯ������");
}
//����������ݷ���,����list����,��������,������
private void print(List<ZhangWu> list) {
	//�����ͷ
		System.out.println("ID\t\t���\t\t�˻�\t\t���\t\tʱ��\t\t˵��");
		//��������,����������̨
		for(ZhangWu zw:list) {
			System.out.println(zw.getZwid()+"\t\t"+zw.getFlname()+"\t\t"+zw.getZhanghu()+"\t\t"
		+zw.getMoney()+"\t\t"+zw.getCreatetime()+"\t"+zw.getDescription());
		}
}


}
