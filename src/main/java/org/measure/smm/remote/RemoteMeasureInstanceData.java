package org.measure.smm.remote;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RemoteMeasureInstanceData implements Serializable{

	private static final long serialVersionUID = 5065151522764343771L;

	private String instanceName;

	private String measureName;

	private String measureVersion;

	private Map<String, String>  properties = new HashMap<>();

	public String getInstanceName() {
		return instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getMeasureName() {
		return measureName;
	}

	public void setMeasureName(String measureName) {
		this.measureName = measureName;
	}

	public String getMeasureVersion() {
		return measureVersion;
	}

	public void setMeasureVersion(String measureVersion) {
		this.measureVersion = measureVersion;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
}
