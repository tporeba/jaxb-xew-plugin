
package annotation_reference;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for classes-us complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classes-us">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="class-us" type="{}class-ext" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classes-us", propOrder = {
    "classUs"
})
public class ClassesUs {

    @XmlElement(name = "class-us", required = true)
    protected List<ClassExt> classUs;

    /**
     * Gets the value of the classUs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classUs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassUs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassExt }
     * 
     * 
     */
    public List<ClassExt> getClassUs() {
        if (classUs == null) {
            classUs = new ArrayList<ClassExt>();
        }
        return this.classUs;
    }

}
