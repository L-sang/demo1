# 字符流复制文件
  * 采用数组缓冲提高效率
  * 字符数组
    * 字符流复制`文本文件`,必须`文本文件`
    * 字符流查询本机默认的 编码表,简体中文GBK
    * FileReader读取数据源
    * FileWriter写入数据目的
    * 代码实现
      
      * 定义两个流的对象变量
      ```
      FileReader fr=null;
      FileWriter fw=null;
      
      ```   
      * 建立两个流的对象,绑定数据源和数据目的 
      ```
      fr=new FileReader("d:\\1.txt");
      fw=new FileWriter("f:\\1.txt");
      
      ```
      * 定义字符数组,缓冲
      ```
      char[] cbuf=new char[1024];
      ```

      * 读取数组,写入数组
      ```    
      int len = 0 ; 
      while((len = fr.read(bytes))!=-1){
       fw.write(cbuf,0,len);
       fw.flush();//需要刷新
       ```
      * 异常处理
