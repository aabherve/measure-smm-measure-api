package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlAttribute;

public class ScopeProperty {
	
	private String name;

	private String defaultValue;
	
	private String description;
	
	@XmlAttribute	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@XmlAttribute
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
}
