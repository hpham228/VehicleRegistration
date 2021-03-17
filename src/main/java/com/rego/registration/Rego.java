package com.rego.registration;

public class Rego {
	private final String m_plate_number;
	private final Vehicle m_vehicle;
	private final Insurer m_insurer;
	private final Registration m_registration;
	
//	public Rego(String plate_number, Vehicle vehicle, Registration registration, Insurer insurer) {
	public Rego(String s_plate_number, Vehicle v_vehicle, Insurer insurer, Registration registration) {
		this.m_plate_number = s_plate_number;
		this.m_vehicle = v_vehicle;
		this.m_registration = registration;
		this.m_insurer = insurer;
	}
	
	public String getPlate_number() {
		return m_plate_number;
	}
	
	public Vehicle getVehicle() {
		return m_vehicle;
	}

	public Insurer getInsurer() {
		return m_insurer;
	}

	public Registration getRegistration() {
		return m_registration;
	}

}
