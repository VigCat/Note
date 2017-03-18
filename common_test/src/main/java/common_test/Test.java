package common_test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Test {
	public static void main(String[] args) {

	}

	public List<UrlInfo> loadXML(String path) {
		SAXParser parser = null;
		try {
			// 构建SAXParser
			parser = SAXParserFactory.newInstance().newSAXParser();
			// 实例化 DefaultHandler对象
			SaxParseXml parseXml = new SaxParseXml();
			// 加载资源文件 转化为一个输入流
			InputStream stream = SaxParseXml.class.getClassLoader().getResourceAsStream("test.xml");
			// 调用parse()方法
			parser.parse(stream, parseXml);
			// 遍历结果
			List<UrlInfo> list = parseXml.getList();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<UrlInfo>();
		}
	}

}
