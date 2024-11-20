package com.beautyhub.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

public class ClientDTO {
    private Long id;

    @NotBlank(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 50, message = "Имя должно быть от 2 до 50 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Имя должно содержать только буквы, без специальных символов")
    private String firstName;

    @NotBlank(message = "Фамилия не должна быть пустой")
    @Size(min = 2, max = 50, message = "Фамилия должна быть от 2 до 50 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Фамилия должна содержать только буквы, без специальных символов")
    private String lastName;

    @NotBlank(message = "Электронная почта не должна быть пустой")
    @Email(message = "Некорректный формат электронной почты")
    private String email;

    @NotBlank(message = "Телефон не должен быть пустым")
    @Pattern(regexp = "^[+]?[0-9]{10,15}$", message = "Телефон должен быть в формате международного номера, от 10 до 15 цифр, может начинаться с +")
    private String phone;

    @NotBlank(message = "Пароль не должен быть пустым")
    @Size(min = 6, max = 100, message = "Пароль должен быть от 6 до 100 символов")
    private String password;

    @NotBlank(message = "Город не должен быть пустым")
    @Size(min = 2, max = 100, message = "Город должен быть от 2 до 100 символов")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Название города должно содержать только буквы, без специальных символов")
    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Имя не должно быть пустым") @Size(min = 2, max = 50, message = "Имя должно быть от 2 до 50 символов") @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Имя должно содержать только буквы, без специальных символов") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank(message = "Имя не должно быть пустым") @Size(min = 2, max = 50, message = "Имя должно быть от 2 до 50 символов") @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Имя должно содержать только буквы, без специальных символов") String firstName) {
        this.firstName = firstName;
    }

    public @NotBlank(message = "Фамилия не должна быть пустой") @Size(min = 2, max = 50, message = "Фамилия должна быть от 2 до 50 символов") @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Фамилия должна содержать только буквы, без специальных символов") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank(message = "Фамилия не должна быть пустой") @Size(min = 2, max = 50, message = "Фамилия должна быть от 2 до 50 символов") @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Фамилия должна содержать только буквы, без специальных символов") String lastName) {
        this.lastName = lastName;
    }

    public @NotBlank(message = "Электронная почта не должна быть пустой") @Email(message = "Некорректный формат электронной почты") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Электронная почта не должна быть пустой") @Email(message = "Некорректный формат электронной почты") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Телефон не должен быть пустым") @Pattern(regexp = "^[+]?[0-9]{10,15}$", message = "Телефон должен быть в формате международного номера, от 10 до 15 цифр, может начинаться с +") String getPhone() {
        return phone;
    }

    public void setPhone(@NotBlank(message = "Телефон не должен быть пустым") @Pattern(regexp = "^[+]?[0-9]{10,15}$", message = "Телефон должен быть в формате международного номера, от 10 до 15 цифр, может начинаться с +") String phone) {
        this.phone = phone;
    }

    public @NotBlank(message = "Пароль не должен быть пустым") @Size(min = 6, max = 100, message = "Пароль должен быть от 6 до 100 символов") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Пароль не должен быть пустым") @Size(min = 6, max = 100, message = "Пароль должен быть от 6 до 100 символов") String password) {
        this.password = password;
    }

    public @NotBlank(message = "Город не должен быть пустым") @Size(min = 2, max = 100, message = "Город должен быть от 2 до 100 символов") @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Название города должно содержать только буквы, без специальных символов") String getCity() {
        return city;
    }

    public void setCity(@NotBlank(message = "Город не должен быть пустым") @Size(min = 2, max = 100, message = "Город должен быть от 2 до 100 символов") @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Название города должно содержать только буквы, без специальных символов") String city) {
        this.city = city;
    }
}