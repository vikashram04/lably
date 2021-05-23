package com.xfactor.lably.controllers;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

import com.xfactor.lably.entity.*;
@RestController
@RequestMapping("/test")
public class TestController {

    // http://localhost:8080/test/hello
    @RequestMapping("/hello")
    public String index() {
        return "Greetings from XFACTOR!!!";
    }

    // http://localhost:8080/test/hello/xfactor
    @GetMapping("/hello/{name}")
    @ResponseBody
    public String index_greetings(@PathVariable String name) {
        return "Greetings :" + name;
    }

    // http://localhost:8080/test/hello2?id=16
    @GetMapping("/hello2")
    @ResponseBody
    public String getFoos(@RequestParam String id) {
        return "ID: " + id;
    }
    @GetMapping("/arin")
    @ResponseBody
    public ArrayList<Lab> f()
    {
        ArrayList<Lab> lab= new ArrayList<>();
        Lab  a = new Lab();
        a.setName("Arin");
        lab.add(a);
        
        return lab;
    }
    @PostMapping("/addLab")
    public ArrayList<Lab>  addLab(@RequestBody ArrayList<Lab> lab)
    {
        return lab;
    }
    @PostMapping("/addAdmin")
    public ArrayList<Admin> addAdmin(@RequestBody ArrayList<Admin> admin)
    {
        return admin;
    }
    @PostMapping("/addTest")
    public ArrayList<Test> addTest(@RequestBody ArrayList<Test> test)
    {
        return test;
    }
    @PostMapping("/addCustomer")
    public ArrayList<Customer> addCustomers(@RequestBody ArrayList<Customer> customer)
    {
        return customer;
    }


}
