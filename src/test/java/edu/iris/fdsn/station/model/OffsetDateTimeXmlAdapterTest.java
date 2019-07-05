package edu.iris.fdsn.station.model;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;

import javax.xml.bind.DatatypeConverter;

import org.junit.Test;

import edu.iris.dmc.fdsn.station.model.ZonedDateTimeXmlAdapter;

public class OffsetDateTimeXmlAdapterTest {

	@Test
	public void test1() throws Exception {
		ZonedDateTimeXmlAdapter offsetDateTimeXmlAdapter = new ZonedDateTimeXmlAdapter();
		ZonedDateTime offsetDateTime = offsetDateTimeXmlAdapter.unmarshal("2500-12-31T23:59:59Z");
	}

	@Test
	public void test2() throws Exception {
		ZonedDateTimeXmlAdapter offsetDateTimeXmlAdapter = new ZonedDateTimeXmlAdapter();
		ZonedDateTime offsetDateTime = offsetDateTimeXmlAdapter.unmarshal("1971-01-01T00:00:00");

		ZonedDateTime other = offsetDateTimeXmlAdapter.unmarshal("1971-01-01T00:00:00");

		assertEquals(offsetDateTime, other);

		ZonedDateTime time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T10:36:11.176973Z");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000Z");

		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000+00");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000+00:00");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000+01");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000-12");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000-12:20");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000-18");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000+18");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000+17:59");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000-01");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000-00");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000+02");
		time = offsetDateTimeXmlAdapter.unmarshal("2016-06-21T00:00:00.000000Z");
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11.176973Z");


		//time = offsetDateTimeXmlAdapter.unmarshal("2019-03-01T04");
		
		
		time = offsetDateTimeXmlAdapter.unmarshal("2019-03-01T04:00:00.1");
		
		time = offsetDateTimeXmlAdapter.unmarshal("2019-03-01T04:00:00.01");
		time = offsetDateTimeXmlAdapter.unmarshal("2019-03-01T04:00:00.10");
		time = offsetDateTimeXmlAdapter.unmarshal("2019-03-01T04:00:00.11");
		time = offsetDateTimeXmlAdapter.unmarshal("2019-03-01T04:00:00.111111");
		
		//ZonedDateTime.parse("2019-03-01T04:00:00.1111", DateTimeFormatter.ISO_INSTANT);

		Calendar cal = DatatypeConverter.parseDateTime("2019-03-01T04:00:00.1");
		ZonedDateTime z = cal.toInstant().atZone(ZoneId.of("UTC"));
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11");
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11.");
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11.1");
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11.11");
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11.111");
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11.1111");
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11.11111");
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11.111111");
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11.1111111");
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11.11111111");
		time = offsetDateTimeXmlAdapter.unmarshal("2015-10-22T05:36:11.111111111");


	}

	@Test
	public void test3() throws Exception {
		DateTimeFormatter dtf = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd['T'HH:mm:ss[.SSS]['Z']]")
				.parseDefaulting(ChronoField.HOUR_OF_DAY, 0).parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
				.parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0).toFormatter().withZone(ZoneId.of("UTC"));
		// DateTimeFormatter dtf =
		// DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.SSS][XXX][X]")
		// .withZone(ZoneId.of("UTC"));

		String source = "1971-01-01T00:00:00Z";

		ZonedDateTime result = ZonedDateTime.parse(source, dtf);
		// TemporalAccessor result = dtf.parseBest(source, ZonedDateTime::from,
		// LocalDateTime::from);
		System.out.println("before: " + source + " after: " + result);

		source = "2019-01-16T16:49:56";
		result = ZonedDateTime.parse(source, dtf);
		System.out.println("before: " + source + " after: " + result);

		source = "1971-01-01T00:00:00Z";
		result = ZonedDateTime.parse(source, dtf);
		System.out.println("before: " + source + " after: " + result);

		source = "1971-01-01";
		result = ZonedDateTime.parse(source, dtf);
		System.out.println("before: " + source + " after: " + result);
	}

}
