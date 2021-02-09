package com.muratcelik.springelastic.service;

import com.muratcelik.springelastic.entity.Ordered;

import java.util.List;

/**
 * @author Murat Çelik
 */
public interface IOrderedService {

    List<Ordered> getAllOrdered();

    void addOrdered(Ordered ordered);

    void deleteOrdered(Long id);

    void updateOrdered(Ordered orderedDetails);
}
