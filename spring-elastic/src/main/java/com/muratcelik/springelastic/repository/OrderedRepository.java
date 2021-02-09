package com.muratcelik.springelastic.repository;

import com.muratcelik.springelastic.entity.Ordered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Murat Çelik
 */
@Repository
public interface OrderedRepository extends JpaRepository<Ordered, Long> {
}