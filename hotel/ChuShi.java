package cn.itcast.hotel;
/*
 *�����ʦ��
 *����Ա��һ��,���ж�������� 
 * �̳�employee,ʵ��VIP�ӿ�
 */
public class ChuShi extends Employee implements VIP {
    //�ղ������췽��
	public ChuShi() {
		super();
	}
	
	//�вι��췽��
	public ChuShi(String name,String id) {
		super(name,id);
	}
	
	//���󷽷���д
	public void work() {
		System.out.println(super.getName()+" "+super.getId()+" "+"�ڳ���");
	}

	public void services() {
		System.out.println(super.getName()+" "+super.getId()+" "+"���˼���");
	}
}
