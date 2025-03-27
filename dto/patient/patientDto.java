package com.elixrlabs.doctorpatientmanagementsystem.dto.patient;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class patientDto {
    private String firstName;
    private String lastName;
    private Date dateOfAdmission;
}
