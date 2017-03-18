package com.civet.common.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.UUID;

/**
 * @author ChengJun
 * @date 2017-03-02 下午8:26:03
 *
 */
public class AppendToFile {
	/**
	 * A方法追加文件：使用RandomAccessFile
	 */
	public static void appendMethodA(String fileName, String content) {
		try {
			// 打开一个随机访问文件流，按读写方式
			RandomAccessFile randomFile = new RandomAccessFile(fileName, "rw");
			// 文件长度，字节数
			long fileLength = randomFile.length();
			// 将写文件指针移到文件尾。
			randomFile.seek(fileLength);
			randomFile.writeBytes(content);
			randomFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * B方法追加文件：使用FileWriter
	 */
	public static void appendMethodFile(String fileName, String content,boolean isAppend) {
		try {
			// 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
			FileWriter writer = new FileWriter(fileName, isAppend);
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getRandomString(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	public static  String getDateTimeString(){
		 return String.valueOf(new Date().getTime());
	} 
	
	public static void main(String[] args) {
		System.out.println(getRandomString());
		String fileName = "C:/temp/a.txt";
		String content = "new append!";
		// //按方法A追加文件
		//AppendToFile.appendMethodA(fileName, content);
	    //AppendToFile.appendMethodFile(fileName, "append end. \n",true);
		// //显示文件内容
		// //FileTest.readFileByLines(fileName);
		// //按方法B追加文件
		// AppendToFile.appendMethodB(fileName, content);
		// AppendToFile.appendMethodB(fileName, "append end. \n");
		// 显示文件内容
		// FileTest.readFileByLines(fileName);
		test();
	}

	public static void test() {
		int i = 1;
		System.out.println(++i + i++);
	}

}
