[# JDBC查询数据库](https://github.com/L-sang/demo1/blob/master/JDBC%E6%93%8D%E4%BD%9C%E6%95%B0%E6%8D%AE%E5%BA%93/JDBC%E5%A2%9E%E5%88%A0%E6%94%B9%E6%95%B0%E6%8D%AE%E5%BA%93.java)
* 1.注册驱动
告知JVM使用的是哪一个数据库的驱动
* 2.获得连接
使用JDBC中的类完成对MySQL数据库的连接
* 3.获得语句执行平台   
通过连接对象获取对SQL语句的执行者对象    
* 4.执行SQL语句
使用执行者对象,向数据库执行SQL语句
* 5.处理结果
* 6.释放资源 一堆close()
