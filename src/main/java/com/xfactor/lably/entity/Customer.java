package com.xfactor.lably.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_cust")

public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long Id; 
    @Column(name = "name")
    String name;
    @Column(name = "address")
    String address;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Column(name = "age")
    String age;
    @Column(name = "gender")
    String gender;
    
}
