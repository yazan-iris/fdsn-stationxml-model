package edu.iris.fdsn.station.model;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import edu.iris.dmc.fdsn.station.model.Channel;
import edu.iris.dmc.fdsn.station.model.Equipment;

public class ChannelTest {

	@Test
	public void channel() throws Exception {
		Channel c = new Channel();
		c.setCode("BHZ");
		c.setLocationCode("00");

		Equipment e1 = new Equipment();
		e1.setSerialNumber("xxxxxxxxx");
		
		Equipment e2 = new Equipment();
		e2.setSerialNumber("xxxxxxxxx");
		c.getEquipment().add(e1);
		c.getEquipment().add(e2);
		JAXB.marshal(c, System.out);

	}
}
