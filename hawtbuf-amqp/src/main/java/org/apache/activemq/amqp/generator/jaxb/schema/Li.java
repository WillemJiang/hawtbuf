//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.08 at 12:32:38 PM PST 
//


package org.apache.activemq.amqp.generator.jaxb.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pOrUl"
})
@XmlRootElement(name = "li")
public class Li {

    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "ul", type = Ul.class)
    })
    protected List<Object> pOrUl;

    /**
     * Gets the value of the pOrUl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pOrUl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrUl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link Ul }
     * 
     * 
     */
    public List<Object> getPOrUl() {
        if (pOrUl == null) {
            pOrUl = new ArrayList<Object>();
        }
        return this.pOrUl;
    }

}
