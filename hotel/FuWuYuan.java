package cn.itcast.hotel;
/*
 *�������Ա��
 *����Ա��һ��,���ж�������� 
 * �̳�employee,ʵ��VIP�ӿ�
 */
public class FuWuYuan extends Employee implements VIP {
        //�ղ������췽��
	 public FuWuYuan() {
			super();
			
		}
        //�в������췽��
		public FuWuYuan(String name, String id) {
			super(name, id);
			
		}
	   

		//���󷽷���д
		public void work() {
			
			System.out.println(super.getName()+" "+super.getId()+" "+"���ϲ�");
		}

		public void services() {
			System.out.println(super.getName()+" "+super.getId()+" "+"���˿͵���");
		}

}
