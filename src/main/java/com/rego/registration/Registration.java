package com.rego.registration;

public class Registration {
	private String m_plate_number;
	private boolean m_expired;
	private String m_expiry_date;
	
	public Registration(String plate_number, boolean expired, String expiry_date) {
		this.m_plate_number = plate_number;
		this.m_expired = expired;
		this.m_expiry_date = expiry_date;
	}
	
	public Boolean getExpired() {
		return m_expired;
	}
	
	public String getExpiry_date() {
		return m_expiry_date;
	}
}
