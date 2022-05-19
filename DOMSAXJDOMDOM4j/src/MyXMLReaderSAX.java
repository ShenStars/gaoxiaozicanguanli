import java.util.*;
import org.xml.sax.*; 
import org.xml.sax.helpers.*; 
import javax.xml.parsers.*; 
public class MyXMLReaderSAX extends DefaultHandler { 
String temp;	
Stack tags = new Stack(); 
private StringBuffer currentValue = new StringBuffer();
public MyXMLReaderSAX() { 
super(); 
} 
public static void main(String args[]) { 
long startTime = System.currentTimeMillis(); 
try { 
SAXParserFactory sf = SAXParserFactory.newInstance(); 
SAXParser sp = sf.newSAXParser(); 
MyXMLReaderSAX reader = new MyXMLReaderSAX(); 
sp.parse(new InputSource("data.xml"), reader); 
} catch (Exception e) { 
e.printStackTrace(); 
} 
System.out.println("运行时间：" + (System.currentTimeMillis()-startTime ) + "毫秒");
}

 /*public void characters(char ch[], int start, int length) throws SAXException { 
String tag = (String) tags.peek(); 
if (tag.equals("NO")) { 
System.out.print("车牌号码：" + new String(ch, start, length)); 
} 
if (tag.equals("ADDR")) { 
System.out.println("地址:" + new String(ch, start, length)); 
} 
} 
public void startElement(String uri,String localName,String qName,Attributes attrs) { 
tags.push(qName);}*/ 

public void startElement(String uri, String localName, String qName, Attributes attributes)    
throws SAXException{  //接收元素开始的通知
currentValue.delete(0, currentValue.length());              
tags.push(qName);
} //读到结束标签会触发该方法

public void endElement(String uri, String localName, String qName )throws SAXException{
temp=(String)tags.pop();
if(temp.equals("NO"))
System.out.println("车牌号码："+currentValue);
if(temp.equals("ADDR"))
System.out.println("地址:"+currentValue);

}
//此方法用来处理XML文件中字符串
public void characters(char[] ch, int start, int length)throws SAXException{
currentValue.append(ch, start, length);
}
} 

