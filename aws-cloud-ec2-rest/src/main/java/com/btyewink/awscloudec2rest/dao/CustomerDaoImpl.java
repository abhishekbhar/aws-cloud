package com.btyewink.awscloudec2rest.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.btyewink.awscloudec2rest.model.Customer;
import org.springframework.stereotype.Component;

@Component("customerDao")
public class CustomerDaoImpl implements CustomerDao {
    private List<Customer> customers;

    {
        customers=new ArrayList<>();
        customers.add(new Customer(getUniqueCustomerId(),"John","Doe","john@email.com"));
        customers.add(new Customer(getUniqueCustomerId(),"Mary","Public","mary@email.com"));
        customers.add(new Customer(getUniqueCustomerId(),"Rahul","Dravid","rahul@email.com"));
        customers.add(new Customer(getUniqueCustomerId(),"Sachin","Tendulkar","sachin@email.com"));
    }
    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }
    private String getUniqueCustomerId()
    {
        return UUID.randomUUID().toString();
    }
    @Override
    public Customer createCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

}