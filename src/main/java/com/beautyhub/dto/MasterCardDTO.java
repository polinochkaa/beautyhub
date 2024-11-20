package com.beautyhub.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class MasterCardDTO {
    @NotNull(message = "ID мастера не должно быть пустым")
    private Long masterId;

    @Size(max = 5, message = "Можно загрузить до 5 ссылок на фотографии")
    private List<String> photoLinks;

    @Size(max = 3, message = "Можно указать до 3 мессенджеров")
    private List<String> messengerLinks;

    @NotBlank(message = "Ссылка на запись не должна быть пустой")
    private String bookingLink;

    @NotNull(message = "Стаж работы не должен быть пустым")
    private Integer experienceYears;

    @NotBlank(message = "Город не должен быть пустым")
    @Size(min = 2, max = 100, message = "Город должен быть от 2 до 100 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Название города должно содержать только буквы, без специальных символов")
    private String city;

    @Size(max = 10, message = "Можно указать до 10 услуг")
    private List<String> services;

    @NotNull(message = "Поле выезд на дом должно быть указано")
    private Boolean homeVisit;

    @Size(max = 500, message = "Комментарий не должен превышать 500 символов")
    private String comment;

    @NotNull(message = "Поле соблюдения норм СанПиН должно быть указано")
    private Boolean sanPinCompliance;

    public @NotNull(message = "ID мастера не должно быть пустым") Long getMasterId() {
        return masterId;
    }

    public void setMasterId(@NotNull(message = "ID мастера не должно быть пустым") Long masterId) {
        this.masterId = masterId;
    }

    public @Size(max = 5, message = "Можно загрузить до 5 ссылок на фотографии") List<String> getPhotoLinks() {
        return photoLinks;
    }

    public void setPhotoLinks(@Size(max = 5, message = "Можно загрузить до 5 ссылок на фотографии") List<String> photoLinks) {
        this.photoLinks = photoLinks;
    }

    public @Size(max = 3, message = "Можно указать до 3 мессенджеров") List<String> getMessengerLinks() {
        return messengerLinks;
    }

    public void setMessengerLinks(@Size(max = 3, message = "Можно указать до 3 мессенджеров") List<String> messengerLinks) {
        this.messengerLinks = messengerLinks;
    }

    public @NotBlank(message = "Ссылка на запись не должна быть пустой") String getBookingLink() {
        return bookingLink;
    }

    public void setBookingLink(@NotBlank(message = "Ссылка на запись не должна быть пустой") String bookingLink) {
        this.bookingLink = bookingLink;
    }

    public @NotNull(message = "Стаж работы не должен быть пустым") Integer getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(@NotNull(message = "Стаж работы не должен быть пустым") Integer experienceYears) {
        this.experienceYears = experienceYears;
    }

    public @NotBlank(message = "Город не должен быть пустым") @Size(min = 2, max = 100, message = "Город должен быть от 2 до 100 символов") @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Название города должно содержать только буквы, без специальных символов") String getCity() {
        return city;
    }

    public void setCity(@NotBlank(message = "Город не должен быть пустым") @Size(min = 2, max = 100, message = "Город должен быть от 2 до 100 символов") @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Название города должно содержать только буквы, без специальных символов") String city) {
        this.city = city;
    }

    public @Size(max = 10, message = "Можно указать до 10 услуг") List<String> getServices() {
        return services;
    }

    public void setServices(@Size(max = 10, message = "Можно указать до 10 услуг") List<String> services) {
        this.services = services;
    }

    public @NotNull(message = "Поле выезд на дом должно быть указано") Boolean getHomeVisit() {
        return homeVisit;
    }

    public void setHomeVisit(@NotNull(message = "Поле выезд на дом должно быть указано") Boolean homeVisit) {
        this.homeVisit = homeVisit;
    }

    public @Size(max = 500, message = "Комментарий не должен превышать 500 символов") String getComment() {
        return comment;
    }

    public void setComment(@Size(max = 500, message = "Комментарий не должен превышать 500 символов") String comment) {
        this.comment = comment;
    }

    public @NotNull(message = "Поле соблюдения норм СанПиН должно быть указано") Boolean getSanPinCompliance() {
        return sanPinCompliance;
    }

    public void setSanPinCompliance(@NotNull(message = "Поле соблюдения норм СанПиН должно быть указано") Boolean sanPinCompliance) {
        this.sanPinCompliance = sanPinCompliance;
    }
}