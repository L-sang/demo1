package cn.itcast.demo;
/*
 * 线程休眠,可能存在安全问题
 */
public class Tickets implements Runnable{
	
	//定义出售的票源
	private int ticket =100;
	private Object obj=new Object();
   public void run() {
	   while(true) {
			   
			  
				   if(ticket>0) {
				   //对票数判断,大于0,可以出售,变量--操作
					   try {
					   Thread.sleep(10);
					   }catch(Exception ex) {}
				   System.out.println(Thread.currentThread().getName()+"出售第"+ticket--);
			   }
			   }
	 
   }
   
}
