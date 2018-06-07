package cn.itcast.copy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *字符流复制文本文件,必须文本文件
 *字符流查询本机默认的 编码表,简体中文GBK
 *FileReader读取数据源
 *FileWriter写入数据目的
 * 
 */
public class Copy_2 {

	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader("d:\\1.txt");
			fw=new FileWriter("f:\\1.txt");
			char[] cbuf=new char[1024];
			int len=0;
			while((len=fr.read(cbuf))!=-1) {
				fw.write(cbuf,0,len);
				fw.flush();
			} 
					
		}catch(IOException ex) {
			System.out.println(ex);
			throw new RuntimeException("复制失败");
		}finally {
			try {
				if(fr!=null)
				fr.close();
			}catch(IOException ex){
				throw new RuntimeException("释放资源失败");
			}finally {
				try {
					fw.close();
				}catch(IOException ex) {
					throw new RuntimeException("释放资源失败");	
				}
				
			}
		}
	
	
	}

}
