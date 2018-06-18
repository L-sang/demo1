package cn.itcast.demo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 *ʹ��jdk1.5�Ľӿ�lock,�滻ͬ�������,ʵ���̵߳İ�ȫ��
 *lock�ӿڷ���:
 *lock()��ȡ��
 *unlock()�ͷ���
 *
 *ʵ����ReentrantLock
 */
public class Tickets implements Runnable{
	
	//������۵�ƱԴ
	private int ticket =100;
	//����ĳ�Աλ��,����lock�ӿڵ�ʵ�������
	private Lock lock=new ReentrantLock();
	
   public void run() {
	   while(true) {
			   //����lock�ӿڷ���:lock()��ȡ��
		          lock.lock();
				   if(ticket>0) {
				   //��Ʊ���ж�,����0,���Գ���,����--����
					   try {
					   Thread.sleep(10);
		 System.out.println(Thread.currentThread().getName()+"���۵�"+ticket--);
						}catch(Exception ex) {
						  
						}finally {
							 lock.unlock();
						}
				      }
			  //�ͷ���,����lock�ӿڷ���:unlock()
				  
	   }
   }
   
}
