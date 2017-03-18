package com.civet.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ChengJun
 * @date 2017-02-27 上午9:28:01
 *
 */
public class Test {
	public static void main(String[] args)  {
		try {
			String a="";
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static  void test() throws Exception {
		//try {
			Double.parseDouble("1234567891020");
		//} catch (Exception e) {
		//	throw new Exception("第 "  + "行 “条行码”有误，请检查。");
		//}
	}
}
