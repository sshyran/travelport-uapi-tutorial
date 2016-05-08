
package com.travelport.schema.air_v35_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v35_0.BaseSearchRsp;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v35_0}BaseSearchRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightTimeTableList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v35_0}FlightTimeDetail" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightTimeTableList"
})
@XmlRootElement(name = "FlightTimeTableRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
public class FlightTimeTableRsp
    extends BaseSearchRsp
{

    @XmlElement(name = "FlightTimeTableList")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    protected FlightTimeTableRsp.FlightTimeTableList flightTimeTableList;

    /**
     * Gets the value of the flightTimeTableList property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTimeTableRsp.FlightTimeTableList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public FlightTimeTableRsp.FlightTimeTableList getFlightTimeTableList() {
        return flightTimeTableList;
    }

    /**
     * Sets the value of the flightTimeTableList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTimeTableRsp.FlightTimeTableList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public void setFlightTimeTableList(FlightTimeTableRsp.FlightTimeTableList value) {
        this.flightTimeTableList = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}FlightTimeDetail" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightTimeDetail"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
    public static class FlightTimeTableList
        implements Locatable
    {

        @XmlElement(name = "FlightTimeDetail", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
        protected List<FlightTimeDetail> flightTimeDetail;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the flightTimeDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightTimeDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightTimeDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightTimeDetail }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
        public List<FlightTimeDetail> getFlightTimeDetail() {
            if (flightTimeDetail == null) {
                flightTimeDetail = new ArrayList<FlightTimeDetail>();
            }
            return this.flightTimeDetail;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-02T04:26:38-07:00", comment = "JAXB RI v2.2.11")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
