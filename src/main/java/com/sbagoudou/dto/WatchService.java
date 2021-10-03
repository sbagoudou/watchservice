package com.sbagoudou.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Datas"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Data" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Langage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "header",
    "datas"
})
@XmlRootElement(name = "WatchService")
public class WatchService {

    @XmlElement(name = "Header", required = true)
    protected WatchService.Header header;
    @XmlElement(name = "Datas", required = true)
    protected WatchService.Datas datas;

    /**
     * Obtient la valeur de la propriété header.
     * 
     * @return
     *     possible object is
     *     {@link WatchService.Header }
     *     
     */
    public WatchService.Header getHeader() {
        return header;
    }

    /**
     * Définit la valeur de la propriété header.
     * 
     * @param value
     *     allowed object is
     *     {@link WatchService.Header }
     *     
     */
    public void setHeader(WatchService.Header value) {
        this.header = value;
    }

    /**
     * Obtient la valeur de la propriété datas.
     * 
     * @return
     *     possible object is
     *     {@link WatchService.Datas }
     *     
     */
    public WatchService.Datas getDatas() {
        return datas;
    }

    /**
     * Définit la valeur de la propriété datas.
     * 
     * @param value
     *     allowed object is
     *     {@link WatchService.Datas }
     *     
     */
    public void setDatas(WatchService.Datas value) {
        this.datas = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Data" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Langage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "data"
    })
    public static class Datas {

        @XmlElement(name = "Data")
        protected List<WatchService.Datas.Data> data;

        /**
         * Gets the value of the data property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the data property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WatchService.Datas.Data }
         * 
         * 
         */
        public List<WatchService.Datas.Data> getData() {
            if (data == null) {
                data = new ArrayList<WatchService.Datas.Data>();
            }
            return this.data;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Langage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "name",
            "langage"
        })
        public static class Data {

            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "Langage", required = true)
            protected String langage;

            /**
             * Obtient la valeur de la propriété name.
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
             * Définit la valeur de la propriété name.
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
             * Obtient la valeur de la propriété langage.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLangage() {
                return langage;
            }

            /**
             * Définit la valeur de la propriété langage.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLangage(String value) {
                this.langage = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
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
        "version"
    })
    public static class Header {

        @XmlElement(name = "Version")
        protected byte version;

        /**
         * Obtient la valeur de la propriété version.
         * 
         */
        public byte getVersion() {
            return version;
        }

        /**
         * Définit la valeur de la propriété version.
         * 
         */
        public void setVersion(byte value) {
            this.version = value;
        }

    }

}
