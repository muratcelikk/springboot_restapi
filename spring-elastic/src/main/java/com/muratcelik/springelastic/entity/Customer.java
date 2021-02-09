package com.muratcelik.springelastic.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Murat Çelik
 */

@Entity
@Data
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private Integer age;

    @Column(name = "city")
    private String city;

    @ManyToOne
    private Ordered ordered;

}
