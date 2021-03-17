package com.rego.registration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegoData {
	
	private final Insurer Allianz = new Insurer("Allianz", 32 );
	private final Insurer AAMI = new Insurer("AAMI", 17);
	private final Insurer GIO = new Insurer("GIO", 13);
	private final Insurer NRMA = new Insurer("NRMA", 27);
	
	private final Vehicle vin_12389347324 = new Vehicle("12389347324", "Wagon", "BMW", "X4 M40i", "Blue", 1700, 0);
	private final Vehicle vin_54646546313 = new Vehicle("54646546313", "Hatch", "Toyota", "Corolla", "Silver", 1432, 1500);
	private final Vehicle vin_87676676762 = new Vehicle("87676676762", "Sedan", "Mercedes", "X4 M040i", "Blue", 1700, 0);
	private final Vehicle vin_65465466541 = new Vehicle("65465466541", "SUV", "Jaguar", "F Pace", "Green", 1620, 0);
	
	
	private final List<Rego> regoList = new ArrayList <>();
	
	public void register_regoList() {
		regoList.add(new Rego("EBF28E", vin_12389347324, Allianz, new Registration("EBF28E", false, "2021-02-05T23:15:30.000Z")));
		regoList.add(new Rego("CXD82F", vin_54646546313, AAMI, new Registration("CXD82F", true, "2020-03-01T23:15:30.000Z")));
		regoList.add(new Rego("WOP29P", vin_87676676762, GIO, new Registration("WOP29P", false, "2020-12-08T23:15:30.000Z")));
		regoList.add(new Rego("QWX55Z", vin_65465466541, NRMA, new Registration("QWX55Z", false, "2021-07-20T23:15:30.000Z")));
	}
	
	
	
	public Rego findRego(String plate_number) {
		Iterator<Rego> iter = regoList.iterator();
		while(iter.hasNext()) {
			Rego rego = iter.next();
//			System.out.println(rego.getPlate_number());
			if (rego.getPlate_number().equals(plate_number)) {
				return rego;
			}
		}
		System.out.println("Cannot find the rego: " + plate_number);
		return null;
	}

	public RegoData() {
		register_regoList();
	}
}
