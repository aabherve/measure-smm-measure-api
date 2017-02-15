package org.measure.smm.measure.defaultimpl.measures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.measure.smm.measure.api.IDirectMeasure;
import org.measure.smm.measure.api.IMeasurement;

public abstract class DirectMeasure implements IDirectMeasure {

	private  Map<String, String> properties = new HashMap<>();
	
	@Override
	public Map<String,String> getProperties(){
		return this.properties;
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
