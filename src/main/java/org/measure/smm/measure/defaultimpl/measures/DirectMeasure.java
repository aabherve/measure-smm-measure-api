package org.measure.smm.measure.defaultimpl.measures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.measure.smm.measure.api.IDirectMeasure;
import org.measure.smm.measure.api.IMeasurement;

public abstract class DirectMeasure implements IDirectMeasure {

	protected Map<String, String> updatedProperties = new HashMap<>();
	private  Map<String, String> properties;
	
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

	@Override
	public abstract List<IMeasurement> getMeasurement() throws Exception;

}
