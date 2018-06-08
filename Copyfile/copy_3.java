package cn.itcast.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用缓冲区流对象,复制文本文件
 * 数据源BufferedReader+FileReader 读取
 * 数据目的 BufferedWriter+FileWriter 写入
 * 读取文本行,读一行,写一行,再换行
 * 
 */
public class Copy_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new FileReader("d:\\w.log"));
		BufferedWriter bfw=new BufferedWriter(new FileWriter("f:\\w.log"));
		//读取文本行,读一行,写一行,再换行
		String line=null;
		while((line=bfr.readLine())!=null) {
			bfw.write(line);
			bfw.newLine();
			bfw.flush();
		}
		bfw.close();
		bfr.close();
	}

}

