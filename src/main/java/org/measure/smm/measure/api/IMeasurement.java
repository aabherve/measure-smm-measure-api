package org.measure.smm.measure.api;

import java.util.Map;

import org.measure.smm.measure.defaultimpl.measurements.DefaultMeasurement;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize(as=DefaultMeasurement.class)
public interface IMeasurement {
	public Map<String, Object> getValues();
    public String getLabel();
}
