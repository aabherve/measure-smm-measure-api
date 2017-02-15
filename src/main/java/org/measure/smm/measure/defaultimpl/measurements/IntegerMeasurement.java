package org.measure.smm.measure.defaultimpl.measurements;

import org.measure.smm.measure.api.IMeasurement;

public class IntegerMeasurement extends DefaultMeasurement {
	
	public IntegerMeasurement(){

	}
	
	public IntegerMeasurement(IMeasurement measurement){
		Object valueType = measurement.getValues().get("valueType");
		if(valueType != null && valueType.equals("IntegerMeasurement")){
			setValues(measurement.getValues());
		}
	}
	
	public void setValue(Integer value){
		addValue("value",value);
	}
	
	public Integer getValue(){
		return (Integer) getValues().get("value");
	}
	
	@Override
	public String getLabel() {
		return getValues().get("value").toString();
	}
}
