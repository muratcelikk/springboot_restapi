package com.muratcelik.springelastic.service;

import com.muratcelik.springelastic.entity.Customer;

import java.util.List;

/**
 * @author Murat Çelik
 */
public interface ICustomerService {

    List<Customer> getAllCustomer();

    void addCustomer(Customer customer);

    void deleteCustomer(Long id);

    void updateCustomer(Customer customerDetails);

}
