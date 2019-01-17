package edu.iris.dmc.fdsn.station.model;


import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public interface NodeType {
	public String getCode();
	public ZonedDateTime getStartDate();
	public ZonedDateTime getEndDate();
}
