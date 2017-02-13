package org.measure.smm.measure.defaultimpl.measures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.measure.smm.measure.api.IDerivedMeasure;
import org.measure.smm.measure.api.IMeasurement;

public abstract class DerivedMeasure implements IDerivedMeasure {

	protected Map<String, String> properties = new HashMap<>();;
	protected Map<String, String> updatedProperties = new HashMap<>();
	protected Map<String,List<IMeasurement>> referenceMap = new HashMap<>();
	protected Map<String,List<IMeasurement>> roleMap = new HashMap<>();;
	
	@Override
	public void setProperties(Map<String, String> properties) {
		this.properties  = properties;
	}
	
	public Map<String,String> getUpdatedProperties(){
		return this.updatedProperties;
	}
	
	public String getProperty(String property){
		String result =  properties.get(property);		
		if(result != null){
			return result;
		}		
		return "";
	}

	public List<IMeasurement> getMeasureInputByName(String name){
		return referenceMap.get(name);
	}
	
	public List<IMeasurement> getMeasureInputByRole(String role){
		return roleMap.get(role);
	}
	
	
	@Override
	public void addMeasureInput(String reference,String role, IMeasurement value){
		List<IMeasurement> references = referenceMap.get(reference);
		if(references == null){
			references = new ArrayList<>();
			referenceMap.put(reference,references);
		}
		references.add(value);
		
		List<IMeasurement> roles = roleMap.get(role);
		if(roles == null){
			roles = new ArrayList<>();
			roleMap.put(role,roles);
		}
		roles.add(value);	
	}

	@Override
	public abstract List<IMeasurement> calculateMeasurement() throws Exception;
	
}
