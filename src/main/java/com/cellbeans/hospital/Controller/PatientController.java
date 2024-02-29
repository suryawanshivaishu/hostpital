package com.cellbeans.hospital.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cellbeans.hospital.Service.PatientService;
import com.cellbeans.hospital.model.Patient;


@RestController 
@CrossOrigin(origins={"http://localhost:3000/"})

@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	
	@GetMapping("/")
	
	public List<Patient> getAllPatient(){
		return patientService.findAll();
	}
	
	
	
	@PostMapping("/")
	public Patient addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}
	
	//build   get patient by id rest api
	@GetMapping("{pid}")
	public ResponseEntity<Optional<Patient>> getPatientById(@PathVariable Long pid){
		Optional<Patient> patient =patientService.findById(pid);
		return ResponseEntity.ok(patient);
	}
	
	//build update patient Rest api 
	@PutMapping("{pid}")
	public ResponseEntity<Patient> updatePatient(@PathVariable Long pid, @RequestBody Patient patientDetails){
		Patient updatePatient =patientService.findById(pid).get();
		
		updatePatient.setName(patientDetails.getName());
		updatePatient.setGender(patientDetails.getGender());
		updatePatient.setAge(patientDetails.getAge());
		updatePatient.setPhone(patientDetails.getPhone());
		updatePatient.setAddress(patientDetails.getAddress());
		patientService.save(updatePatient);
		return ResponseEntity.ok(updatePatient);
	}

	
	 //build delete patient Rest api
   @DeleteMapping("{pid}")
	public String deletePatient(@PathVariable Long pid) {
	    patientService.deleteById(pid);
	    return "Patient deleted with id:" + pid;
	}
}
