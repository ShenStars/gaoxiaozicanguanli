import java.io.*; 
import java.util.*; 
import org.dom4j.*; 
import org.dom4j.io.*; 
public class MyXMLReaderDOMFJ { 
public static void main(String arge[]) { 
long startTime = System.currentTimeMillis(); 
try { 
File f = new File("data.xml"); 
SAXReader reader = new SAXReader(); 
Document doc = reader.read(f); 
Element root = doc.getRootElement(); 
Element foo; 
for (Iterator i = root.elementIterator("VALUE"); i.hasNext();){ 
foo = (Element) i.next(); 
System.out.print("车牌号码:" + foo.elementText("NO")); 
System.out.println("车主地址:" + foo.elementText("ADDR")); 
}
}
catch (Exception e){ 
e.printStackTrace(); 
 } 
System.out.println("运行时间：" + (System.currentTimeMillis()-startTime ) + "毫秒"); 
 }
}