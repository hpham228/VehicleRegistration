package com.rego.registration;

public class Insurer {
	private final String m_name;
	private final long m_code;
	
	public Insurer(String name, long code) {
		this.m_name = name;
		this.m_code = code;
	}
	
	public String getName() {
		return m_name;
	}

	public long getCode() {
		return m_code;
	}
}
