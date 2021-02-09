package com.muratcelik.springelastic.service.implementation;

import com.muratcelik.springelastic.entity.Customer;
import com.muratcelik.springelastic.repository.CustomerRepository;
import com.muratcelik.springelastic.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Murat Çelik
 */
@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void updateCustomer(Customer customerDetails) {
        Customer customer = customerRepository.getOne(customerDetails.getId());
        customer.setName(customerDetails.getName());
        customer.setSurname(customerDetails.getSurname());
        customer.setAge(customerDetails.getAge());
        customer.setCity(customer.getCity());
        customer.setOrdered(customerDetails.getOrdered());
        customerRepository.save(customer);
    }
}
