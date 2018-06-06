# 字节流复制文件
  * 采用数组缓冲提高效率
  * 字节数组
    * FileInputStream 读取字节数组
    * FileOutputStream 写字节数组
    * 代码实现
      * 定义两个流的对象变量
```      
      FileInputStream fis = null;
      FileOutputStream fos = null;
```
      * 建立两个流的对象,绑定数据源和数据目的
```
      fis = new FileInputStream("c:\\t.zip");
      fos = new FileOutputStream("d:\\t.zip");
```      
      * 定义字节数组,缓冲
```
      byte[] bytes = new byte[1024*10];
```
      * 读取数组,写入数组
```    
      int len = 0 ; 
      while((len = fis.read(bytes))!=-1){
       fos.write(bytes, 0, len);}      
 ```
      * 异常处理
      	
 
	
	
			
