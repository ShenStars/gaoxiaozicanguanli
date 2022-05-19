
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Ҫ��sax��������Ҫʵ��һ��ParseHandler
 * @author whd
 *
 */
public class SaxParseHandler extends DefaultHandler{

	/**
	 * ��д��DefaultHandler�е�startElement������ÿ������
	 * һ��Ԫ�أ�element����ʱ�򶼻ᴥ��������������ҽ����element
	 * ������attributes��ֵvalue��������������������startElement,
	 * ����startDocument��endDOucment��endElement��Ҫ������Ҫ
	 * ��д��Щ������
	 */
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		
		//��ӡelement�Ļ�����Ϣ��qName
		System.out.println("Element qName    : "+qName);
		System.out.println("Element localName: "+localName);
		System.out.println("Element uri      : "+uri);
		//��ӡelement����������attributes
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
