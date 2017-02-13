package org.measure.smm.measure.api;

import java.util.Map;

public interface IMeasure {
	public void setProperties(Map<String,String> properties);
	public Map<String,String> getUpdatedProperties();
}
