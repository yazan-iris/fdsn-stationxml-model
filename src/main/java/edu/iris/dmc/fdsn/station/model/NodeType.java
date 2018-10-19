package edu.iris.dmc.fdsn.station.model;


import javax.xml.datatype.XMLGregorianCalendar;

public interface NodeType {
	public String getCode();
	public XMLGregorianCalendar getStartDate();
	public XMLGregorianCalendar getEndDate();
}
