package com.rego.registration;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Iterator;
// import java.util.List;

// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleRestController {

//	private static final String template = "Hello, %s!";
//	private final AtomicLong counter = new AtomicLong();
	private final RegoData regoData = new RegoData();

	@GetMapping("/Rego")
	public Rego rego(@RequestParam(value = "plate_number", defaultValue = "unknown") String plate_number) {
//		Vehicle myVehicle = new Vehicle("54646546313","Hatch");
//		return new Rego(plate_number, myVehicle);
		return regoData.findRego(plate_number);
	}
}