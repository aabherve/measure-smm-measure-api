package org.measure.smm.measure.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Measure")
public class SMMMeasure {
	
	private String name;
		
	private MeasureType type;
	
	private MeasureUnite unite;
	
	private String description;
	
	private String callbackAdress;
	
	private String callbackLable;
			
	private List<ScopeProperty> scopeProperties;
	private List<MeasureReference> references;
	
	public SMMMeasure(){
		this.scopeProperties = new ArrayList<>();
		this.references = new ArrayList<>(); 
	}
	
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
	public MeasureType getType() {
		return type;
	}
	
	public void setType(MeasureType type) {
		this.type = type;
	}

	public List<ScopeProperty> getScopeProperties() {
		return scopeProperties;
	}

	public void setScopeProperties(List<ScopeProperty> scopeProperties) {
		this.scopeProperties = scopeProperties;
	}

	@XmlAttribute
	public MeasureUnite getUnite() {
		return unite;
	}
	public void setUnite(MeasureUnite unite) {
		this.unite = unite;
	}

	public List<MeasureReference> getReferences() {
		return references;
	}

	public void setReferences(List<MeasureReference> references) {
		this.references = references;
	}

	public String getCallbackAdress() {
		return callbackAdress;
	}

	public void setCallbackAdress(String callbackAdress) {
		this.callbackAdress = callbackAdress;
	}

	public String getCallbackLable() {
		return callbackLable;
	}

	public void setCallbackLable(String callbackLable) {
		this.callbackLable = callbackLable;
	}
}
