package common_test;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 功能描述:采用sax方式解析XML<br>
 * 
 * @author ChengJun
 * @date 2017-02-20 下午4:26:50
 *
 */
public class SaxParseXml extends DefaultHandler {

	// 存放遍历集合
	private List<UrlInfo> list;
	// 构建UrlInfo对象
	// private UrlInfo UrlInfo;
	// 用来存放每次遍历后的元素名称(节点名称)
	private String tagName;

	public List<UrlInfo> getList() {
		return list;
	}

	public void setList(List<UrlInfo> list) {
		this.list = list;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	// 只调用一次 初始化list集合
	@Override
	public void startDocument() throws SAXException {
		list = new ArrayList<UrlInfo>();
	}

	// 调用多次 开始解析
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("UrlInfo")) {
			list.add(new UrlInfo());
		}
		this.tagName = qName;
	}

	// 调用多次
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		this.tagName = null;
	}

	// 只调用一次
	@Override
	public void endDocument() throws SAXException {
		System.out.println("解析XML结束");
	}

	// 调用多次
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (this.tagName != null) {
			String data = new String(ch, start, length);
			if (this.tagName.equals("translator")) {
				list.get(list.size() - 1).setTranslator(data);
				;
			} else if (this.tagName.equals("url")) {
				list.get(list.size() - 1).setUrl(data);
			}
		}
	}
}