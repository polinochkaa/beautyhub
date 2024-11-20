package com.beautyhub.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "master_cards")
public class MasterCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long masterId;

    @ElementCollection
    private List<String> photoLinks;

    @ElementCollection
    private List<String> messengerLinks;

    @Column(nullable = false)
    private String bookingLink;

    @Column(nullable = false)
    private Integer experienceYears;

    @Column(nullable = false)
    private String city;

    @ElementCollection
    private List<String> services;

    @Column(nullable = false)
    private Boolean homeVisit;

    @Column(length = 500)
    private String comment;

    @Column(nullable = false)
    private Boolean sanPinCompliance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMasterId() {
        return masterId;
    }

    public void setMasterId(Long masterId) {
        this.masterId = masterId;
    }

    public List<String> getPhotoLinks() {
        return photoLinks;
    }

    public void setPhotoLinks(List<String> photoLinks) {
        this.photoLinks = photoLinks;
    }

    public List<String> getMessengerLinks() {
        return messengerLinks;
    }

    public void setMessengerLinks(List<String> messengerLinks) {
        this.messengerLinks = messengerLinks;
    }

    public String getBookingLink() {
        return bookingLink;
    }

    public void setBookingLink(String bookingLink) {
        this.bookingLink = bookingLink;
    }

    public Integer getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(Integer experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public Boolean getHomeVisit() {
        return homeVisit;
    }

    public void setHomeVisit(Boolean homeVisit) {
        this.homeVisit = homeVisit;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getSanPinCompliance() {
        return sanPinCompliance;
    }

    public void setSanPinCompliance(Boolean sanPinCompliance) {
        this.sanPinCompliance = sanPinCompliance;
    }
}