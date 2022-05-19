
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 要用sax解析，需要实现一个ParseHandler
 * @author whd
 *
 */
public class SaxParseHandler extends DefaultHandler{

	/**
	 * 重写了DefaultHandler中的startElement函数，每解析到
	 * 一个元素（element）的时候都会触发这个函数，并且将这个element
	 * 的属性attributes和值value当作参数传进来。除了startElement,
	 * 还有startDocument，endDOucment，endElement，要根据需要
	 * 重写这些函数。
	 */
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		
		//打印element的基本信息，qName
		System.out.println("Element qName    : "+qName);
		System.out.println("Element localName: "+localName);
		System.out.println("Element uri      : "+uri);
		//打印element的所有属性attributes
		for(int i=0; i<attributes.getLength(); i++) {
			System.out.println("");
			System.out.println("  attribute qName    : "+attributes.getQName(i));
			System.out.println("  attribute localName: "+attributes.getLocalName(i));
			System.out.println("  attribute value    : "+attributes.getValue(i));
			System.out.println("  attribute uri      : "+attributes.getURI(i));
		}
		System.out.println("");
		super.startElement(uri, localName, qName, attributes);
	}
	
}
