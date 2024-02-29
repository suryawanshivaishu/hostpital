package com.cellbeans.hospital.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cellbeans.hospital.Repo.PatientRepo;
import com.cellbeans.hospital.Service.PatientService;
import com.cellbeans.hospital.model.Patient;

@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	PatientRepo patientRepo;
	
	
	@Override
	public Patient addPatient(Patient patient) {
		Patient newPatient = new Patient();
		newPatient = patientRepo.save(patient);
		
		return newPatient;
	}


	@Override
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}


	@Override
	public Optional<Patient> findById(Long pid) {
		// TODO Auto-generated method stub
		return patientRepo.findById(pid);
	}
	
	  @Override
	    public Patient save(Patient patient) {
	        return patientRepo.save(patient);
	    }

	  @Override
	  public void updatePatient(Long pid, Patient patientDetails) {
	      Optional<Patient> optionalPatient = findById(pid);
	      if (optionalPatient.isPresent()) {
	          Patient updatePatient = optionalPatient.get();
	          updatePatient.setName(patientDetails.getName());
	          updatePatient.setGender(patientDetails.getGender());
	          updatePatient.setAge(patientDetails.getAge());
	          updatePatient.setPhone(patientDetails.getPhone());
	          updatePatient.setAddress(patientDetails.getAddress());
	          patientRepo.save(updatePatient);
	      } else {
	          // Handle the case where patient with the given id is not found
	      }
	      
	  }


	  @Override
	    public void deleteById(Long id) {
	        patientRepo.deleteById(id);
	    }
	  
	 
}
	 
	