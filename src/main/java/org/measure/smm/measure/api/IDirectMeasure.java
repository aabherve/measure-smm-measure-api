package org.measure.smm.measure.api;

import java.util.List;

public interface IDirectMeasure extends IMeasure {
	public List<IMeasurement> getMeasurement() throws Exception;
}
