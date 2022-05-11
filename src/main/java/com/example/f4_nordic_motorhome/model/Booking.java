package com.example.f4_nordic_motorhome.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Booking {

    private int bookingId;
    private String registrationPlate;
    private int customerId;
    private LocalDate startDate;
    private LocalDate endDate;

}
