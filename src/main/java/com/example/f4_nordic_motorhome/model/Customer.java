package com.example.f4_nordic_motorhome.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String licenseNumber;
    private String cLicense;
    private LocalDate dateOfBirth;

}
