package com.cellbeans.hospital.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cellbeans.hospital.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {

	


}
