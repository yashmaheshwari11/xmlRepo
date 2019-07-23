package com.zensar.xml.sax.parsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class movieXmlHandler extends DefaultHandler
{

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		for(int i=start;i<start+length;i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
	}

	@Override
	public void endDocument() throws SAXException {
		
		super.endDocument();
	}

	@Override
	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(arg0, arg1, arg2);
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(arg0, arg1, arg2, arg3);
	}
	
}
