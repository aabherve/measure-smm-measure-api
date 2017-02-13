package org.measure.smm.remote;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.measure.smm.log.MeasureLog;

public class RemoteExecutionResult implements Serializable{

	private static final long serialVersionUID = -3743229332104151746L;
	
	private Map<String, String> updatedProperties;
	private MeasureLog executionLog;

	public RemoteExecutionResult() {
		this.updatedProperties = new HashMap<>();
	}

	public Map<String, String> getUpdatedProperties() {
		return updatedProperties;
	}

	public void setUpdatedProperties(Map<String, String> updatedProperties) {
		this.updatedProperties = updatedProperties;
	}

	public MeasureLog getExecutionLog() {
		return executionLog;
	}

	public void setExecutionLog(MeasureLog executionLog) {
		this.executionLog = executionLog;
	}
}
