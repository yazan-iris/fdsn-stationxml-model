package edu.iris.station.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import edu.iris.station.model.FDSNStationXML;

public class StationIOUtils {
	public static StationXmlIterator stationXmlIterator(final InputStream InputStream) throws IOException {
		return new StationXmlIterator(InputStream);
	}

	public static FDSNStationXML stationXmlDocument(final InputStream InputStream)
			throws IOException, JAXBException, SAXException {
		return (FDSNStationXML) StationUnmarshaller.unmarshaller().unmarshal(InputStream);
	}
	
	public static void writeXml(final OutputStream outputStream, FDSNStationXML document)
			throws JAXBException, IOException {
		StationMarshaller.marshal(document, outputStream);
	}
	
	
}

