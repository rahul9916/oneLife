package com.myspace.onelife;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class eventDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "eventCity")
	private java.lang.String eventCity;
	@org.kie.api.definition.type.Label(value = "eventTown")
	private java.lang.String eventTown;
	@org.kie.api.definition.type.Label(value = "eventProvince")
	private java.lang.String eventProvince;

	public eventDetails() {
	}

	public java.lang.String getEventCity() {
		return this.eventCity;
	}

	public void setEventCity(java.lang.String eventCity) {
		this.eventCity = eventCity;
	}

	public java.lang.String getEventTown() {
		return this.eventTown;
	}

	public void setEventTown(java.lang.String eventTown) {
		this.eventTown = eventTown;
	}

	public java.lang.String getEventProvince() {
		return this.eventProvince;
	}

	public void setEventProvince(java.lang.String eventProvince) {
		this.eventProvince = eventProvince;
	}

	public eventDetails(java.lang.String eventCity, java.lang.String eventTown,
			java.lang.String eventProvince) {
		this.eventCity = eventCity;
		this.eventTown = eventTown;
		this.eventProvince = eventProvince;
	}

}