import java.io.File;
import java.util.List;

import org.jdom.*;
import org.jdom.input.*; 
public class MyXMLReaderJDOM { 
public static void main(String arge[]) { 
long startTime = System.currentTimeMillis(); 
try { 
SAXBuilder builder = new SAXBuilder(); 
Document doc = builder.build(new File("data.xml")); 
Element foo = doc.getRootElement(); 
List allChildren = foo.getChildren(); 
for(int i=0;i<allChildren.size();i++) { 
System.out.print("车牌号码:" + ((Element)allChildren.get(i)).getChild("NO").getText()); 
System.out.println("车主地址:" + ((Element)allChildren.get(i)).getChild("ADDR").getText());} 
} catch (Exception e) { 
e.printStackTrace(); 
 } 
System.out.println("运行时间：" + (System.currentTimeMillis()-startTime ) + "毫秒"); 
}
}