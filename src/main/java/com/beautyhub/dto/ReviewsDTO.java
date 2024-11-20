package com.beautyhub.dto;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class ReviewsDTO {

    public ReviewsDTO(Long id, Long userId, Long masterId, Float rating, String reviewText) {
        this.id = id;
        this.userId = userId;
        this.masterId = masterId;
        this.rating = rating;
        this.reviewText = reviewText;
    }

    private Long id; // Автоматически генерируемое поле, не требует валидации

    @NotNull(message = "ID пользователя не должно быть пустым")
    private Long userId;

    @NotNull(message = "ID мастера не должно быть пустым")
    private Long masterId;

    @NotNull(message = "Рейтинг не должен быть пустым")
    @DecimalMin(value = "1.00", message = "Рейтинг должен быть не менее 1.00")
    @DecimalMax(value = "5.00", message = "Рейтинг должен быть не более 5.00")
    @Digits(integer = 1, fraction = 2, message = "Рейтинг должен быть числом с двумя знаками после запятой")
    private Float rating;

    @NotBlank(message = "Текст отзыва не должен быть пустым")
    @Size(max = 1000, message = "Текст отзыва не должен превышать 1000 символов")
    private String reviewText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "ID пользователя не должно быть пустым") Long getUserId() {
        return userId;
    }

    public void setUserId(@NotNull(message = "ID пользователя не должно быть пустым") Long userId) {
        this.userId = userId;
    }

    public @NotNull(message = "ID мастера не должно быть пустым") Long getMasterId() {
        return masterId;
    }

    public void setMasterId(@NotNull(message = "ID мастера не должно быть пустым") Long masterId) {
        this.masterId = masterId;
    }

    public @NotNull(message = "Рейтинг не должен быть пустым") @DecimalMin(value = "1.00", message = "Рейтинг должен быть не менее 1.00") @DecimalMax(value = "5.00", message = "Рейтинг должен быть не более 5.00") @Digits(integer = 1, fraction = 2, message = "Рейтинг должен быть числом с двумя знаками после запятой") Float getRating() {
        return rating;
    }

    public void setRating(@NotNull(message = "Рейтинг не должен быть пустым") @DecimalMin(value = "1.00", message = "Рейтинг должен быть не менее 1.00") @DecimalMax(value = "5.00", message = "Рейтинг должен быть не более 5.00") @Digits(integer = 1, fraction = 2, message = "Рейтинг должен быть числом с двумя знаками после запятой") Float rating) {
        this.rating = rating;
    }

    public @NotBlank(message = "Текст отзыва не должен быть пустым") @Size(max = 1000, message = "Текст отзыва не должен превышать 1000 символов") String getReviewText() {
        return reviewText;
    }

    public void setReviewText(@NotBlank(message = "Текст отзыва не должен быть пустым") @Size(max = 1000, message = "Текст отзыва не должен превышать 1000 символов") String reviewText) {
        this.reviewText = reviewText;
    }
}
