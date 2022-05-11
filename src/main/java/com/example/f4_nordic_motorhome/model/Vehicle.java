package com.example.f4_nordic_motorhome.model;

import lombok.Data;
@Data
public class Vehicle {

    private String registrationPlate;
    private int capacity;
    private String brand;
    private String model;
    private String cLicenseRequirement;
    private double totalKm;

}

