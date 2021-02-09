package com.muratcelik.springelastic.repository;

import com.muratcelik.springelastic.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Murat Çelik
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}


