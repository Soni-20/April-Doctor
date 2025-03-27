package com.elixrlabs.doctorpatientmanagementsystem.rest.controller.patient;

import com.elixrlabs.doctorpatientmanagementsystem.model.patient.PatientModel;
import com.elixrlabs.doctorpatientmanagementsystem.service.patient.PatientGetByNameService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping
@CrossOrigin
public class PatientGetByNameController {
    @Autowired
    private PatientGetByNameService patientGetByNameService;

    @GetMapping("viewone")
    public ResponseEntity<PatientModel> viewPatient(@PathParam("patientFirstName") UUID patientId, String patientFirstName, String patientLastName, Date dateOfAdmission) {
        return new ResponseEntity<PatientModel>(patientGetByNameService.viewPatient(new PatientModel(patientId,patientFirstName,patientLastName,dateOfAdmission)), HttpStatus.OK);
    }


}
