package com.xfactor.lably.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_test")
public class Test {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    String name;
    @Column(name = "desc")
    String description;
    @Column(name = "price")
    double price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}
