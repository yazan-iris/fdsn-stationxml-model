package edu.iris.fdsn.station.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import edu.iris.dmc.fdsn.station.model.FDSNStationXML;

public class ReadFromFile {

	@Test
	public void testApp2() throws JAXBException, FileNotFoundException {

		try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("iu.xml");) {
			JAXBContext jaxbContext = JAXBContext.newInstance(edu.iris.dmc.fdsn.station.model.ObjectFactory.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			FDSNStationXML doc = (FDSNStationXML) jaxbUnmarshaller.unmarshal(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
