//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 12:27:14 AM PDT 
//

package com.crawljax.core.plugin.descriptor.jaxb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="crawljax-versions" type="{}version-list"/&gt;
 *         &lt;element name="parameters" type="{}parameter-list" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "name", "description", "crawljaxVersions",
		"parameters" })
@XmlRootElement(name = "plugin-descriptor")
public class PluginDescriptor {

	@XmlElement(required = true)
	protected String name;
	@XmlElement(required = true)
	protected String description;
	@XmlElement(name = "crawljax-versions", required = true)
	protected VersionList crawljaxVersions;
	protected ParameterList parameters;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the crawljaxVersions property.
	 * 
	 * @return possible object is {@link VersionList }
	 * 
	 */
	public VersionList getCrawljaxVersions() {
		return crawljaxVersions;
	}

	/**
	 * Sets the value of the crawljaxVersions property.
	 * 
	 * @param value
	 *            allowed object is {@link VersionList }
	 * 
	 */
	public void setCrawljaxVersions(VersionList value) {
		this.crawljaxVersions = value;
	}

	/**
	 * Gets the value of the parameters property.
	 * 
	 * @return possible object is {@link ParameterList }
	 * 
	 */
	public ParameterList getParameters() {
		return parameters;
	}

	/**
	 * Sets the value of the parameters property.
	 * 
	 * @param value
	 *            allowed object is {@link ParameterList }
	 * 
	 */
	public void setParameters(ParameterList value) {
		this.parameters = value;
	}

}
