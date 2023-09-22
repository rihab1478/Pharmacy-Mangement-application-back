package com.pi.tobeeb.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Delivery implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDelivery;
    private String customerName;
    private String customerAddress;
    private LocalDate dateDelivery;
    private String status;
    private String vehicule;
    private double price;
   // @JsonIgnore
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "delivery")
    //private Set<Order2> orders;
}
