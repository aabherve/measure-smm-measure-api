package org.measure.smm.measure.api;

import java.util.List;

public interface IDerivedMeasure extends IMeasure {
	public void addMeasureInput(String reference,String role, IMeasurement value);
	public List<IMeasurement> calculateMeasurement() throws Exception;
}
