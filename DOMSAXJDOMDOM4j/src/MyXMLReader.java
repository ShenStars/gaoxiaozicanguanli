import java.io.*; 
//import java.util.*; 
import org.w3c.dom.*; 
import javax.xml.parsers.*; 
public class MyXMLReader{ 
 public static void main(String arge[]){ 
long startTime =System.currentTimeMillis(); 
try{ 
File f=new File("data.xml");
DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance(); 
DocumentBuilder builder=factory.newDocumentBuilder(); 
Document doc = builder.parse(f); 
NodeList nl = doc.getElementsByTagName("VALUE"); 
for (int i=0;i<nl.getLength();i++){ 
System.out.print("���ƺ���:" + doc.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue()); 
System.out.println("������ַ:" + doc.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
} 
}catch(Exception e){ 
e.printStackTrace(); 
  }

System.out.println("����ʱ�䣺" + (System.currentTimeMillis()-startTime ) + "����");
 }
}