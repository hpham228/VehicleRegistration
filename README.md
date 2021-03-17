# VehicleRegistration
The project was built and test under JDK 16:
java version "16" 2021-03-16
Java(TM) SE Runtime Environment (build 16+36-2231)
Java HotSpot(TM) 64-Bit Server VM (build 16+36-2231, mixed mode, sharing)

To build and run:
mvnw.cmd spring-boot:run

To test, open Chrome, and point to:
valid request ==> http://localhost:8080/Rego?plate_number=QWX55Z
Unknown plate number ==> http://localhost:8080/Rego?plate_number=QWX55

All the data are hardcoded, using provided data at https://dl.dropboxusercontent.com/s/wcp5aajrrx533bp/snsw_registrations_api.json
