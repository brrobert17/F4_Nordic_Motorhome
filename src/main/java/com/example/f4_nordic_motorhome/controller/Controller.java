package com.example.f4_nordic_motorhome.controller;

import com.example.f4_nordic_motorhome.DAO.BookingDAO;
import com.example.f4_nordic_motorhome.DAO.CustomerDAO;
import com.example.f4_nordic_motorhome.DAO.VehicleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    //autowire to the repository
    @Autowired
    CustomerDAO customerDAO;

    @Autowired
    BookingDAO bookingDAO;

    @Autowired
    VehicleDAO vehicleDAO;

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/templates/customersPage.html")
    public String showCustomers(Model model) {
        model.addAttribute("customersList", customerDAO.getCustomers());
        return "customersPage";
    }

    @GetMapping("/templates/vehiclesPage.html")
    public String showVehicles(Model model) {
        model.addAttribute("vehiclesList", vehicleDAO.getVehicles());
        return "vehiclesPage";
    }

    @GetMapping("/templates/bookingsPage.html")
    public String showBookings(Model model) {
        model.addAttribute("bookingsList", bookingDAO.getBookings());
        return "bookingsPage";
    }
    @GetMapping("/templates/makeABooking.html")
    public String makeABooking(Model model) {
        model.addAttribute("registrationPlate", vehicleDAO.getVehiclePlate(
                vehicleDAO.getVehicles().get(0).getRegistrationPlate()));

        return "makeABooking";
    }

}
