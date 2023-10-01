package com.btyewink.awscloudec2rest.controller;


import com.btyewink.awscloudec2rest.dao.CustomerDao;
import com.btyewink.awscloudec2rest.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerDao customerDao;

    //constructor injection
    public CustomerController(CustomerDao customerDao) {
        super();
        this.customerDao = customerDao;
    }

    @GetMapping
    public List<Customer> getCustomers()
    {
        return customerDao.getAllCustomers();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer)
    {
        customer.setCustomerId(UUID.randomUUID().toString());
        return customerDao.createCustomer(customer);
    }

}