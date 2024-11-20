package com.beautyhub.repositories;

import com.beautyhub.entities.MasterCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterCardRepository extends JpaRepository<MasterCard, Long> {
    // Поиск карточек мастеров по ID мастера
    List<MasterCard> findByMasterId(Long masterId);

    // Поиск карточек по городу
    List<MasterCard> findByCity(String city);

    // Поиск карточек с домашними визитами
    List<MasterCard> findByHomeVisitTrue();

    // Пример сложного запроса (по городу и домашнему визиту)
    List<MasterCard> findByCityAndHomeVisitTrue(String city);
}
