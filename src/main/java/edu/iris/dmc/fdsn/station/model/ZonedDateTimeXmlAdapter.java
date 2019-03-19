package edu.iris.dmc.fdsn.station.model;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ZonedDateTimeXmlAdapter extends XmlAdapter<String, ZonedDateTime> {

	private final DateTimeFormatter dtf = new DateTimeFormatterBuilder()
			.appendPattern("yyyy-MM-dd['T'HH:mm:ss[.SSSSSSSSS][.SSSSSS][.SSS]['Z']]").parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
			.parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0).parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
			.toFormatter().withZone(ZoneId.of("UTC")).withResolverStyle(ResolverStyle .LENIENT);;

	@Override
	public ZonedDateTime unmarshal(String stringValue) throws Exception {
		if (stringValue == null) {
			return null;
		}
		if ("".equals(stringValue.trim())) {
			return null;
		}
		ZonedDateTime offsetDateTime = null;

		try {
			TemporalAccessor result = dtf.parseBest(stringValue, ZonedDateTime::from, LocalDateTime::from);
			offsetDateTime = ZonedDateTime.from(result);
		} catch (DateTimeParseException e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return offsetDateTime;

	}

	@Override
	public String marshal(ZonedDateTime value) throws Exception {
		return value != null ? value.format(DateTimeFormatter.ISO_INSTANT) : null;
	}

}
