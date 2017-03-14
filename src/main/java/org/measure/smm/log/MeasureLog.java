package org.measure.smm.log;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.measure.smm.measure.api.IMeasurement;

public class MeasureLog implements Serializable{

	private static final long serialVersionUID = -2821791213393760528L;

	private boolean success  =false;

	private List<IMeasurement> mesurement;
	
	private Long executionTime;
	
	private String measureInstanceName;
	
	private String measureName;
	
	private Long measureInstanceId;
	
	private List<MeasureLogParameters> parameters = new ArrayList<>();
		
	private List<MeasureLogInput> inputs = new ArrayList<>();
	
	private Map<String,String> updatedParameters = new HashMap<>();

	private String exceptionMessage;
	
	private Date exectionDate;
	
	
	public void setLog(MeasureLog log){
		this.success  = log.isSuccess();
		this.mesurement  = log.getMesurement();		
		this.executionTime  = log.getExecutionTime();	
		this.measureInstanceName  = log.getMeasureInstanceName() ;	
		this.measureName  = log.getMeasureName();
		this.inputs   = log.getInputs();
		this.exceptionMessage  = log.getExceptionMessage();	
		this.exectionDate = log.getExectionDate();
		this.measureInstanceId = log.getMeasureInstanceId();
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public List<IMeasurement>  getMesurement() {
		return mesurement;
	}

	public void setMesurement(List<IMeasurement> mesurement) {
		this.mesurement = mesurement;
	}

	public Long getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Long executionTime) {
		this.executionTime = executionTime;
	}

	public String getMeasureInstanceName() {
		return measureInstanceName;
	}

	public void setMeasureInstanceName(String measureInstanceName) {
		this.measureInstanceName = measureInstanceName;
	}

	public String getMeasureName() {
		return measureName;
	}

	public Map<String, String> getUpdatedParameters() {
		return updatedParameters;
	}

	public void setUpdatedParameters(Map<String, String> updatedParameters) {
		this.updatedParameters = updatedParameters;
	}

	public void setMeasureName(String measureName) {
		this.measureName = measureName;
	}

	public List<MeasureLogParameters> getParameters() {
		return parameters;
	}

	public void setParameters(List<MeasureLogParameters> parameters) {
		this.parameters = parameters;
	}
	
	
	public List<MeasureLogInput> getInputs() {
		return inputs;
	}
	
	public void setInputs(List<MeasureLogInput> inputs) {
		this.inputs = inputs;
	}	
	
	public Date getExectionDate() {
		return exectionDate;
	}

	public void setExectionDate(Date exectionDate) {
		this.exectionDate = exectionDate;
	}
	

	public Long getMeasureInstanceId() {
		return measureInstanceId;
	}

	public void setMeasureInstanceId(Long measureInstanceId) {
		this.measureInstanceId = measureInstanceId;
	}



	public class MeasureLogParameters implements Serializable{
		private static final long serialVersionUID = 1L;
		private String name;
		private String value;
		
		public MeasureLogParameters(){
			
		}

		public MeasureLogParameters(String propertyName, String propertyValue) {
			this.name = propertyName;
			this.value = propertyValue;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}	
	}
	
	public class MeasureLogInput implements Serializable{
		private static final long serialVersionUID = 755611453331572588L;
		private String role;
		private IMeasurement value;


		public MeasureLogInput(String role, IMeasurement value) {
			this.role = role;
			this.value = value;
		}

		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}


		public IMeasurement getValue() {
			return value;
		}


		public void setValue(IMeasurement value) {
			this.value = value;
		}
	}
}
