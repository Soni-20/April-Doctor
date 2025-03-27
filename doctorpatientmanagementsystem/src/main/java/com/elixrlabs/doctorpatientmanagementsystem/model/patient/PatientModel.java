package com.elixrlabs.doctorpatientmanagementsystem.model.patient;

import com.elixrlabs.doctorpatientmanagementsystem.constant.DataBaseConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = DataBaseConstants.PATIENT)
@Getter
@Setter
@AllArgsConstructor
public class PatientModel {
    @Id
    private UUID patientId;
    private String patientFirstName;
    private String patientLastName;
    private Date dateOfAdmission;
}
