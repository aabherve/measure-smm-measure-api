package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlAttribute;

public class MeasureReference {
	
	private String measureRef;
	
	private String role;
	
	private Long expirationDelay;
	
	private int number;
	


	@XmlAttribute
	public String getMeasureRef() {
		return measureRef;
	}

	public void setMeasureRef(String measureRef) {
		this.measureRef = measureRef;
	}

	@XmlAttribute
	public Long getExpirationDelay() {
		return expirationDelay;
	}

	public void setExpirationDelay(Long expirationDelay) {
		this.expirationDelay = expirationDelay;
	}

	@XmlAttribute
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
