package com.xfactor.lably.controllers;

import java.util.List;
import java.util.Optional;

import com.xfactor.lably.entity.Customer;
import com.xfactor.lably.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/getById")
    public Customer getLabById(@RequestParam Long id) {
        Optional<Customer> lab = customerRepository.findById(id);
        if (lab.isPresent()) {
            return lab.get();
        }
        return null;
    }

    @PostMapping("/add")
    public Customer addLab(@RequestBody Customer customer) {
        Customer persistedLab = customerRepository.save(customer);
        return persistedLab;
    }

    @GetMapping("/getAll")
    public List<Customer> getAdmins() {
        return customerRepository.findAll();
    }

}
