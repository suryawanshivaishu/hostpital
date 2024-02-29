package com.cellbeans.hospital.Service;

import java.util.List;
import java.util.Optional;

import com.cellbeans.hospital.model.Patient;

public interface PatientService {

	 Patient addPatient(Patient patient);

	    List<Patient> findAll();

	    Optional<Patient> findById(Long pid);

	    Patient save(Patient patient);

	    void updatePatient(Long pid, Patient patientDetails);

		void deleteById(Long pid);
	}
    
	

