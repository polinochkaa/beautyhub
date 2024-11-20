package com.beautyhub.repositories;

import com.beautyhub.entities.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
    // Поиск отзывов по мастеру
    List<Reviews> findByMasterId(Long masterId);

    // Поиск отзывов пользователя
    List<Reviews> findByUserId(Long userId);

    // Поиск отзывов по рейтингу
    List<Reviews> findByRatingGreaterThanEqual(Float rating);
}
