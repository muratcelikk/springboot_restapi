package com.muratcelik.springelastic.controller;

import com.muratcelik.springelastic.entity.Ordered;
import com.muratcelik.springelastic.service.implementation.OrderedService;
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
public class OrderedController {

    private final OrderedService orderedService;

    //GetAll
    @RequestMapping(value = "/ordered", method = RequestMethod.GET)
    public ResponseEntity<Collection<Ordered>> getAllCustomer() {  //Collection
        return new ResponseEntity<>(orderedService.getAllOrdered(), HttpStatus.OK);
    }

    //Add
    @RequestMapping(value = "/ordered", method = RequestMethod.POST)
    public ResponseEntity<String> addOrdered(@RequestBody Ordered ordered) {
        orderedService.addOrdered(ordered);
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }

    //Delete
    @RequestMapping(value = "/ordered/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteOrdered(@PathVariable Long id) {
        orderedService.deleteOrdered(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    //Update
    @RequestMapping(value = "/ordered/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Ordered> updateOrdered(@RequestBody Ordered ordered, @PathVariable Long id) {
        ordered.setId(id);
        orderedService.updateOrdered(ordered);
        return ResponseEntity.noContent().build();
    }
}
