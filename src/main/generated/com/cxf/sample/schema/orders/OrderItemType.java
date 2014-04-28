
package com.cxf.sample.schema.orders;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderItemType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="OrderItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expectedShippingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="book" type="{http://sample.cxf.com/schema/Orders/}BookType"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="quantityShpped" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemType", propOrder = {
        "lineNumber",
        "expectedShippingDate",
        "book",
        "price",
        "quantityShpped"
})
public class OrderItemType {

    @XmlElement(required = true)
    protected String lineNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedShippingDate;
    @XmlElement(required = true)
    protected BookType book;
    @XmlElement(required = true)
    protected BigDecimal price;
    protected int quantityShpped;

    /**
     * Gets the value of the lineNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the expectedShippingDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getExpectedShippingDate() {
        return expectedShippingDate;
    }

    /**
     * Sets the value of the expectedShippingDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setExpectedShippingDate(XMLGregorianCalendar value) {
        this.expectedShippingDate = value;
    }

    /**
     * Gets the value of the book property.
     *
     * @return possible object is
     * {@link BookType }
     */
    public BookType getBook() {
        return book;
    }

    /**
     * Sets the value of the book property.
     *
     * @param value allowed object is
     *              {@link BookType }
     */
    public void setBook(BookType value) {
        this.book = value;
    }

    /**
     * Gets the value of the price property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the quantityShpped property.
     */
    public int getQuantityShpped() {
        return quantityShpped;
    }

    /**
     * Sets the value of the quantityShpped property.
     */
    public void setQuantityShpped(int value) {
        this.quantityShpped = value;
    }

}
