package cn.itcast.demo;
/*
 * ͨ���߳�����,���ְ�ȫ����
 * �����ȫ����,java����,�ṩ����,ͬ������
 * ��ʽ:
 *   synchronized(�������){
 *     �߳�Ҫ�����Ĺ�������
 *   }
 *   ͬ�������
 */
public class Tickets implements Runnable{
	
	//������۵�ƱԴ
	private int ticket =100;
	private Object obj=new Object();
   public void run() {
	   while(true) {
			   //�̹߳�������,��֤��ȫ,����ͬ�������
			   synchronized (obj) {
				   if(ticket>0) {
				   //��Ʊ���ж�,����0,���Գ���,����--����
					   try {
					   Thread.sleep(10);
					   }catch(Exception ex) {}
				   System.out.println(Thread.currentThread().getName()+"���۵�"+ticket--);
			   }
			   }
	   }
   }
   
}
