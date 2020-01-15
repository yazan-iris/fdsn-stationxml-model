package edu.iris.station.io;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import edu.iris.station.model.FDSNStationXML;

public class StationMarshaller {
	public static void marshal(FDSNStationXML document, File file) throws IOException, JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(edu.iris.station.model.ObjectFactory.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(document, file);
	}

	public static void marshal(FDSNStationXML document, OutputStream stream) throws IOException, JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(edu.iris.station.model.ObjectFactory.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(document, stream);
	}
}
