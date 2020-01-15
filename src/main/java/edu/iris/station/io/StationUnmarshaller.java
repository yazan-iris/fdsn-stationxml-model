package edu.iris.station.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import edu.iris.station.model.FDSNStationXML;

public class StationUnmarshaller {

	public static FDSNStationXML unmarshal(InputStream inputStream) throws Exception {
		return (FDSNStationXML) unmarshaller().unmarshal(inputStream);
	}

	public static FDSNStationXML unmarshalString(String inputStream) throws JAXBException, SAXException, IOException {
		Unmarshaller jaxbUnmarshaller = unmarshaller();
		return (FDSNStationXML) jaxbUnmarshaller.unmarshal(new StringReader(inputStream));
	}

	public static Unmarshaller unmarshaller() throws JAXBException, SAXException, IOException {
		JAXBContext jaxbContext = JAXBContext.newInstance(edu.iris.station.model.ObjectFactory.class);
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

		try (InputStream stream = StationUnmarshaller.class.getClassLoader().getResourceAsStream("station.1.1.xsd");) {
			Schema stationSchema = sf.newSchema(new StreamSource(stream));
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			unmarshaller.setSchema(stationSchema);
			return unmarshaller;
		}
	}
}
