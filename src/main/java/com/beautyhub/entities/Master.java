package com.beautyhub.entities;

import javax.persistence.*;

@Entity
@Table(name = "masters")
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String city;
    private String comment;
    private Boolean homeVisit;
    private Boolean sanPinCompliance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getHomeVisit() {
        return homeVisit;
    }

    public void setHomeVisit(Boolean homeVisit) {
        this.homeVisit = homeVisit;
    }

    public Boolean getSanPinCompliance() {
        return sanPinCompliance;
    }

    public void setSanPinCompliance(Boolean sanPinCompliance) {
        this.sanPinCompliance = sanPinCompliance;
    }
}
