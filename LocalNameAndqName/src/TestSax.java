import java.io.File;
import java.io.FileReader;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class TestSax {
	public static void main(String... args) {
		
		try {
			//Sax2解析XML文档
			System.out.println("parse xml file use sax2");
			SaxParseHandler sax2Handler = new SaxParseHandler();
			XMLReader xmlReader = XMLReaderFactory.createXMLReader();//
			xmlReader.setContentHandler(sax2Handler);
			xmlReader.setErrorHandler(sax2Handler);

			FileReader fileReader = new FileReader("sample.xml");
			xmlReader.parse(new InputSource(fileReader));
			
			//sax解析XML文档
			System.out.println("parse xml file use sax");
			SaxParseHandler saxHandler = new SaxParseHandler();
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();//
			
			File file = new File("sample.xml");
	        parser.parse(file, saxHandler);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
