package cn.itcast.hotel;
/*
 *���徭���� 
 * ����Ա��һ��,û��VIP����
 * �Լ��н�������
 */
public class JingLi extends Employee {
    //����ղ������췽��

	   public JingLi() {
			super();
			
		}
	 //�������������췽��	
		public JingLi(String name, String id,double money) {
			super(name, id);
			this.money=money;
			
		}
	
	//���影������
	private double money;
	

   public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	//��д���󷽷�
	public void work() {
		System.out.println(super.getName()+" "+super.getId()+" "+"˭����˭"+"  "+"���꽱����"+this.money );
	}

}
