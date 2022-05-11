package com.example.f4_nordic_motorhome.DAO;

import com.example.f4_nordic_motorhome.model.Customer;
import com.example.f4_nordic_motorhome.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VehicleDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Vehicle> getVehicles() {
        String sql = "SELECT * FROM nordic_motorhome.vehicles;";
        RowMapper<Vehicle> rowMapper = new BeanPropertyRowMapper<>(Vehicle.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    //loop for a registration_plate in the vehicles table
    public Vehicle getVehiclePlate(String registration_plate) {
        String sql = "SELECT * FROM nordic_motorhome.vehicles WHERE registration_plate = ?";
        RowMapper<Vehicle> rowMapper = new BeanPropertyRowMapper<>(Vehicle.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, registration_plate);

    }



}

