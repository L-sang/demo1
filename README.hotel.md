
# 小型酒店系统

* [员工抽象类](https://github.com/L-sang/demo1/blob/master/hotel/Employee.java):姓名,工号(共性)
* [公共接口](https://github.com/L-sang/demo1/blob/master/hotel/VIP.java):VIP服务,工作方法 
* 员工类:
  * [厨师](https://github.com/L-sang/demo1/blob/master/hotel/ChuShi.java)
    * 实现接口VIP服务(厨师做菜加量)
  * [服务员](https://github.com/L-sang/demo1/blob/master/hotel/FuWuYuan.java)
    * 实现接口VIP服务(服务员给顾客倒酒)
  * [经理](https://github.com/L-sang/demo1/blob/master/hotel/JingLi.java)
    * 经理有奖金(特有属性)

* 编写[测试类](https://github.com/L-sang/demo1/blob/master/hotel/Test.java)  
  * 向酒店中,增加多名员工(1名经理,2名厨师,两名服务员)  
  * 调用酒店员工的工作功能  
  * 调用酒店员工的VIP服务功能
