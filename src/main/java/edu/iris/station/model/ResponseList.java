//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.15 at 01:37:05 PM PDT 
//


package edu.iris.station.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

import org.w3c.dom.Element;


/**
 * Response: list of frequency, amplitude and phase values. Corresponds
 * 				to SEED blockette 55. 
 * 
 * <p>Java class for ResponseListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseListType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fdsn.org/xml/station/1}BaseFilterType">
 *       &lt;sequence>
 *         &lt;element name="ResponseListElement" type="{http://www.fdsn.org/xml/station/1}ResponseListElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseListType", propOrder = {
		"description", "inputUnits", "outputUnits", "any",
    "responseListElement"
})
public class ResponseList
    extends BaseFilter
{
	@XmlAttribute(name = "resourceId")
	protected String resourceId;
	@XmlAttribute(name = "name")
	protected String name;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();
	@XmlElement(name = "Description")
	protected String description;
	@XmlElement(name = "InputUnits", required = true)
	protected Units inputUnits;
	@XmlElement(name = "OutputUnits", required = true)
	protected Units outputUnits;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
    @XmlElement(name = "ResponseListElement")
    protected List<ResponseListElement> responseListElement;



    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the inputUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Units }
     *     
     */
    public Units getInputUnits() {
        return inputUnits;
    }

    /**
     * Sets the value of the inputUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Units }
     *     
     */
    public void setInputUnits(Units value) {
        this.inputUnits = value;
    }

    /**
     * Gets the value of the outputUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Units }
     *     
     */
    public Units getOutputUnits() {
        return outputUnits;
    }

    /**
     * Sets the value of the outputUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Units }
     *     
     */
    public void setOutputUnits(Units value) {
        this.outputUnits = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceId(String value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the responseListElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseListElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseListElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseListElement }
     * 
     * 
     */
    public List<ResponseListElement> getResponseListElement() {
        if (responseListElement == null) {
            responseListElement = new ArrayList<ResponseListElement>();
        }
        return this.responseListElement;
    }

}