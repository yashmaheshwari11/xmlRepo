package com.zensar.xml.sax.parsers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.*;

import org.xml.sax.SAXException;


public class movieXmlParser {

	public static void main (String [] args)
	{
		try {
			SAXParserFactory factory= SAXParserFactory.newInstance();
			
			SAXParser parser= factory.newSAXParser();
			
			parser.parse(new File("./src/moviedetails.xml"), new movieXmlHandler());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
