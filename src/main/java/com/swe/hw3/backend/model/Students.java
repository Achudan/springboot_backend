package com.swe.hw3.backend.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "studentsform")
public class Students {
    @Id
    @Getter@Setter
    @Column(name="email")
    private String email;
    @Column(name="first_name")
    @Getter@Setter
    private String first_name;
    @Column(name="last_name")
    @Getter@Setter
    private String last_name;
    @Column(name="street_address")
    @Getter@Setter
    private String street_address;
    @Column(name="city")
    @Getter@Setter
    private String city;
    @Column(name="state")
    @Getter@Setter
    private String state;
    @Column(name="zipcode")
    @Getter@Setter
    private int zipcode;
    @Column(name="phone")
    @Getter@Setter
    private String phone;
    @Column(name="date")
    @Getter@Setter
    private String date;
    @Column(name="interested")
    @Getter@Setter
    private String interested;
    @Column(name="recommend_option")
    @Getter@Setter
    private String recommend_option;
    @Column(name="random_number")
    @Getter@Setter
    private String random_number;
    @Column(name="comment")
    @Getter@Setter
    private String comment;
    @Column(name="prefer_atmosphere")
    @Getter@Setter
    private String prefer_atmosphere;
    @Column(name="prefer_campus")
    @Getter@Setter
    private String prefer_campus;
    @Column(name="prefer_dormroom")
    @Getter@Setter
    private String prefer_dormroom;
    @Column(name="prefer_location")
    @Getter@Setter
    private String prefer_location;
    @Column(name="prefer_sports")
    @Getter@Setter
    private String prefer_sports;
    @Column(name="prefer_students")
    @Getter@Setter
    private String prefer_students;
    @Column(name="age")
    @Getter@Setter
    private int age;
}
