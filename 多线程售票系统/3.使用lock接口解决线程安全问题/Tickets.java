package cn.itcast.demo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 *使用jdk1.5的接口lock,替换同步代码块,实现线程的安全性
 *lock接口方法:
 *lock()获取锁
 *unlock()释放锁
 *
 *实现类ReentrantLock
 */
public class Tickets implements Runnable{
	
	//定义出售的票源
	private int ticket =100;
	//在类的成员位置,创建lock接口的实现类对象
	private Lock lock=new ReentrantLock();
	
   public void run() {
	   while(true) {
			   //调用lock接口方法:lock()获取锁
		          lock.lock();
				   if(ticket>0) {
				   //对票数判断,大于0,可以出售,变量--操作
					   try {
					   Thread.sleep(10);
		 System.out.println(Thread.currentThread().getName()+"出售第"+ticket--);
						}catch(Exception ex) {
						  
						}finally {
							 lock.unlock();
						}
				      }
			  //释放锁,调用lock接口方法:unlock()
				  
	   }
   }
   
}
