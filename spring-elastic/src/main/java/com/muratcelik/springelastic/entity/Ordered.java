package com.muratcelik.springelastic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Murat Çelik
 */

@Entity
@Data
@Table(name = "ordered")
public class Ordered implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "order_details")
    private String order_details;

    @Column(name = "order_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Integer order_date;

    @OneToMany(mappedBy = "ordered", targetEntity = Customer.class)
    private List<Customer> customers;
}

