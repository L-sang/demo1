# 字节流复制文件
  * 采用数组缓冲提高效率
  * 字节数组
    * FileInputStream 读取字节数组
    * FileOutputStream 写字节数组
    * 代码实现
      * 定义两个流的对象变量
```
      fis = new FileInputStream("c:\\t.zip");
			fos = new FileOutputStream("d:\\t.zip");
```
      * 建立两个流的对象,绑定数据源和数据目的
      * 定义字节数组,缓冲
      * 读取数组,写入数组
