package edu.iris.fdsn.station.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import edu.iris.station.model.FDSNStationXML;

public class ReadFromFile {

	@Test
	public void testApp2() throws JAXBException, FileNotFoundException {

		try (InputStream inputStream = new FileInputStream("/Users/Suleiman/C1_LL07.XML");) {
			JAXBContext jaxbContext = JAXBContext.newInstance(edu.iris.station.model.ObjectFactory.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			FDSNStationXML doc = (FDSNStationXML) jaxbUnmarshaller.unmarshal(inputStream);

			System.out
					.println(doc.getNetwork().get(0).getStartDate() + "      " + doc.getNetwork().get(0).getEndDate());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
