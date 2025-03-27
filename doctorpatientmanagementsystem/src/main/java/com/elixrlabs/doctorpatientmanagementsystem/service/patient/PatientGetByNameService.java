package com.elixrlabs.doctorpatientmanagementsystem.service.patient;

import com.elixrlabs.doctorpatientmanagementsystem.model.patient.PatientModel;
import com.elixrlabs.doctorpatientmanagementsystem.repository.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientGetByNameService {
    @Autowired
    private PatientRepository patientRepository;
    public PatientModel viewPatient(PatientModel patientModel) {
        Optional<PatientModel> patient = patientRepository.findByPatientFirstName(patientModel.getPatientFirstName());
        if (patient.isPresent() && patient != null) {
            return patient.get();
        }
        return new PatientModel();
    }

}
