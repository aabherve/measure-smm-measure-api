package org.measure.smm.remote;

import java.util.HashMap;
import java.util.Map;

public class RemoteMeasureInstance{
		private Long measureId;

		private String instanceName;

		private String measureName;

		private String measureVersion;
		
		private String shedulingExpression;

		private Map<String, String>  properties = new HashMap<>();

		public String getInstanceName() {
			return instanceName;
		}

		
		public Long getMeasureId() {
			return measureId;
		}


		public void setMeasureId(Long measureId) {
			this.measureId = measureId;
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

		public String getShedulingExpression() {
			return shedulingExpression;
		}

		public void setShedulingExpression(String shedulingExpression) {
			this.shedulingExpression = shedulingExpression;
		}
	}