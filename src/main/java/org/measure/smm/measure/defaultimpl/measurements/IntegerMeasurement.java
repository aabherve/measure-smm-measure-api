package org.measure.smm.measure.defaultimpl.measurements;

public class IntegerMeasurement extends DefaultMeasurement {
	
	public IntegerMeasurement(){

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
