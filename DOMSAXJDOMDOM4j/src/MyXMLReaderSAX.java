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
System.out.println("����ʱ�䣺" + (System.currentTimeMillis()-startTime ) + "����");
}

 /*public void characters(char ch[], int start, int length) throws SAXException { 
String tag = (String) tags.peek(); 
if (tag.equals("NO")) { 
System.out.print("���ƺ��룺" + new String(ch, start, length)); 
} 
if (tag.equals("ADDR")) { 
System.out.println("��ַ:" + new String(ch, start, length)); 
} 
} 
public void startElement(String uri,String localName,String qName,Attributes attrs) { 
tags.push(qName);}*/ 

public void startElement(String uri, String localName, String qName, Attributes attributes)    
throws SAXException{  //����Ԫ�ؿ�ʼ��֪ͨ
currentValue.delete(0, currentValue.length());              
tags.push(qName);
} //����������ǩ�ᴥ���÷���

public void endElement(String uri, String localName, String qName )throws SAXException{
temp=(String)tags.pop();
if(temp.equals("NO"))
System.out.println("���ƺ��룺"+currentValue);
if(temp.equals("ADDR"))
System.out.println("��ַ:"+currentValue);

}
//�˷�����������XML�ļ����ַ���
public void characters(char[] ch, int start, int length)throws SAXException{
currentValue.append(ch, start, length);
}
} 

