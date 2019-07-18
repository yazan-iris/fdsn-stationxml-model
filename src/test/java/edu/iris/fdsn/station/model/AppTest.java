package edu.iris.fdsn.station.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import edu.iris.dmc.fdsn.station.model.FDSNStationXML;
import edu.iris.dmc.fdsn.station.model.Latitude;
import edu.iris.dmc.fdsn.station.model.Network;
import edu.iris.dmc.fdsn.station.model.ObjectFactory;
import edu.iris.dmc.fdsn.station.model.Station;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 * 
	 * @throws JAXBException
	 */
	public void testApp() throws JAXBException {

	}

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

	public void testApp3() throws JAXBException, FileNotFoundException {
		FDSNStationXML doc = new FDSNStationXML();
		Network n=new Network();
		n.setCode("Test");
		doc.getNetwork().add(n);

		JAXBContext jaxbContext = JAXBContext.newInstance(edu.iris.dmc.fdsn.station.model.ObjectFactory.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		Station s = new Station();
		Latitude latitude = new Latitude();
		latitude.setValue(Double.valueOf(22));
		latitude.setDatum("Moon");
		s.setLatitude(latitude);
		n.getStations().add(s);

		marshaller.marshal(doc, System.out);

	}
}
