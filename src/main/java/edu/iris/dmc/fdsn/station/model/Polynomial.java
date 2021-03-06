//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.15 at 01:37:05 PM PDT 
//


package edu.iris.dmc.fdsn.station.model;

import java.math.BigInteger;
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
 * Response: expressed as a polynomial (allows non-linear sensors to be
 * 				described). Corresponds to SEED blockette 62. Can be used to describe a stage of
 * 				acquisition or a complete system. 
 * 
 * <p>Java class for PolynomialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolynomialType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fdsn.org/xml/station/1}BaseFilterType">
 *       &lt;sequence>
 *         &lt;element name="ApproximationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="MACLAURIN"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FrequencyLowerBound" type="{http://www.fdsn.org/xml/station/1}FrequencyType"/>
 *         &lt;element name="FrequencyUpperBound" type="{http://www.fdsn.org/xml/station/1}FrequencyType"/>
 *         &lt;element name="ApproximationLowerBound" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ApproximationUpperBound" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MaximumError" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Coefficient" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.fdsn.org/xml/station/1>FloatNoUnitType">
 *                 &lt;attribute name="number" type="{http://www.fdsn.org/xml/station/1}CounterType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "PolynomialType", propOrder = {
		"description", "inputUnits", "outputUnits", "any",
    "approximationType",
    "frequencyLowerBound",
    "frequencyUpperBound",
    "approximationLowerBound",
    "approximationUpperBound",
    "maximumError",
    "coefficient"
})
public class Polynomial
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
    @XmlElement(name = "ApproximationType", required = true, defaultValue = "MACLAURIN")
    protected String approximationType;
    @XmlElement(name = "FrequencyLowerBound", required = true)
    protected Frequency frequencyLowerBound;
    @XmlElement(name = "FrequencyUpperBound", required = true)
    protected Frequency frequencyUpperBound;
    @XmlElement(name = "ApproximationLowerBound")
    protected Double approximationLowerBound;
    @XmlElement(name = "ApproximationUpperBound")
    protected Double approximationUpperBound;
    @XmlElement(name = "MaximumError")
    protected Double maximumError;
    @XmlElement(name = "Coefficient", required = true)
    protected List<Polynomial.Coefficient> coefficient;


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
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }
    /**
     * Gets the value of the approximationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximationType() {
        return approximationType;
    }

    /**
     * Sets the value of the approximationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximationType(String value) {
        this.approximationType = value;
    }

    /**
     * Gets the value of the frequencyLowerBound property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getFrequencyLowerBound() {
        return frequencyLowerBound;
    }

    /**
     * Sets the value of the frequencyLowerBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setFrequencyLowerBound(Frequency value) {
        this.frequencyLowerBound = value;
    }

    /**
     * Gets the value of the frequencyUpperBound property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getFrequencyUpperBound() {
        return frequencyUpperBound;
    }

    /**
     * Sets the value of the frequencyUpperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setFrequencyUpperBound(Frequency value) {
        this.frequencyUpperBound = value;
    }

    /**
     * Gets the value of the approximationLowerBound property.
     * 
     */
    public Double getApproximationLowerBound() {
        return approximationLowerBound;
    }

    /**
     * Sets the value of the approximationLowerBound property.
     * 
     */
    public void setApproximationLowerBound(Double value) {
        this.approximationLowerBound = value;
    }

    /**
     * Gets the value of the approximationUpperBound property.
     * 
     */
    public Double getApproximationUpperBound() {
        return approximationUpperBound;
    }

    /**
     * Sets the value of the approximationUpperBound property.
     * 
     */
    public void setApproximationUpperBound(Double value) {
        this.approximationUpperBound = value;
    }

    /**
     * Gets the value of the maximumError property.
     * 
     */
    public Double getMaximumError() {
        return maximumError;
    }

    /**
     * Sets the value of the maximumError property.
     * 
     */
    public void setMaximumError(Double value) {
        this.maximumError = value;
    }

    /**
     * Gets the value of the coefficient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coefficient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoefficient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polynomial.Coefficient }
     * 
     * 
     */
    public List<Polynomial.Coefficient> getCoefficient() {
        if (coefficient == null) {
            coefficient = new ArrayList<Polynomial.Coefficient>();
        }
        return this.coefficient;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.fdsn.org/xml/station/1>FloatNoUnitType">
     *       &lt;attribute name="number" type="{http://www.fdsn.org/xml/station/1}CounterType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Coefficient
        extends FloatNoUnitType
    {

        @XmlAttribute(name = "number")
        protected BigInteger number;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumber(BigInteger value) {
            this.number = value;
        }

    }

}
