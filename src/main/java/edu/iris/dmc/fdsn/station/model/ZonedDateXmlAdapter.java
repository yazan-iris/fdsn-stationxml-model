package edu.iris.dmc.fdsn.station.model;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ZonedDateXmlAdapter extends XmlAdapter<String, ZonedDateTime> {

	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[XXX][X]")
			.withZone(ZoneId.of("UTC"));// DateTimeFormatter.ISO_ZONED_DATE_TIME;

	@Override
	public ZonedDateTime unmarshal(String stringValue) throws Exception {

		if (stringValue == null) {
			return null;
		}
		
		return ZonedDateTime.parse(stringValue, formatter);

	}

	@Override
	public String marshal(ZonedDateTime value) throws Exception {
		return value != null ? formatter.format(value) : null;
	}

}
