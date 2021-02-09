package com.muratcelik.springelastic.controller;

import com.muratcelik.springelastic.entity.Customer;
import com.muratcelik.springelastic.service.implementation.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author Murat Çelik
 */
@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    //GetAll
    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ResponseEntity<Collection<Customer>> getAllCustomer() {  //Collection
        return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.OK);
    }

    //Add
    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    //Delete
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    //Update
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
        customer.setId(id);
        customerService.updateCustomer(customer);
        return ResponseEntity.noContent().build();
    }
}
