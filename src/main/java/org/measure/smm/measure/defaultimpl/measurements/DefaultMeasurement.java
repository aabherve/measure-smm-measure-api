package org.measure.smm.measure.defaultimpl.measurements;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.measure.smm.measure.api.IMeasurement;

public class DefaultMeasurement implements IMeasurement {
	
	protected Map<String, Object> valueMap;
	
	public DefaultMeasurement(){
		this.valueMap = new HashMap<>();
		this.valueMap.put("postDate", new Date());
	}

	public void addValue(String property,Object value){
		this.valueMap.put(property,value);
	}

	@Override
	public Map<String, Object> getValues() {
		return valueMap;
	}

	@Override
	public void setValues(Map<String, Object> values) {
		this.valueMap = values;		
	}
}
