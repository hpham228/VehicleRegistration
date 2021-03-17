package com.rego.registration;

public class Vehicle {
	private final String m_vin; //Primary key
	private final String m_type;
	private final String m_make;
	private final String m_model;
	private final String m_colour;
	private final long m_tare_weight;
	private final long m_gross_mass;

	public Vehicle(String vin, String type, String make, String model, String colour, long tare_weight, long gross_mass) {
		this.m_vin = vin;
		this.m_type = type;
		this.m_make = make;
		this.m_model = model;
		this.m_colour = colour;
		this.m_tare_weight = tare_weight;
		this.m_gross_mass = gross_mass;
	}

	public String getVin() {
		return m_vin;
	}

	public String getType() {
		return m_type;
	}

	public String getMake() {
		return m_make;
	}

	public String getModel() {
		return m_model;
	}

	public String getColour() {
		return m_colour;
	}

	public long getTareWeight() {
		return m_tare_weight;
	}

	public long getGrossMass() {
		return m_gross_mass;
	}


}