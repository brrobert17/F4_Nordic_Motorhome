package com.example.f4_nordic_motorhome.DAO;

import com.example.f4_nordic_motorhome.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Customer> getCustomers() {
        String sql = "SELECT * FROM nordic_motorhome.customers;";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        return jdbcTemplate.query(sql, rowMapper);
    }
    //look for customer id in database
    public Customer getCustomer(int id) {
        String sql = "SELECT * FROM nordic_motorhome.customers WHERE id = ?";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

}
