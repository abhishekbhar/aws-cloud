package com.btyewink.awscloudec2rest.dao;

import com.btyewink.awscloudec2rest.model.Customer;

import java.util.List;


public interface CustomerDao {

    List<Customer> getAllCustomers();

    Customer createCustomer(Customer customer);

}