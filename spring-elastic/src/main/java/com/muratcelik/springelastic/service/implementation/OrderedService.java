package com.muratcelik.springelastic.service.implementation;

import com.muratcelik.springelastic.entity.Ordered;
import com.muratcelik.springelastic.repository.OrderedRepository;
import com.muratcelik.springelastic.service.IOrderedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Murat Çelik
 */
@Service
@RequiredArgsConstructor
public class OrderedService implements IOrderedService {

    private final OrderedRepository orderedRepository;

    @Override
    public List<Ordered> getAllOrdered() {
        return orderedRepository.findAll();
    }

    @Override
    public void addOrdered(Ordered ordered) {
        orderedRepository.save(ordered);
    }

    @Override
    public void deleteOrdered(Long id) {
        orderedRepository.deleteById(id);
    }

    @Override
    public void updateOrdered(Ordered orderedDetails) {
        Ordered ordered = orderedRepository.getOne(orderedDetails.getId());
        ordered.setOrder_details(orderedDetails.getOrder_details());
        ordered.setOrder_date(orderedDetails.getOrder_date());
        ordered.setCustomers(orderedDetails.getCustomers());
        orderedRepository.save(ordered);
    }
}
