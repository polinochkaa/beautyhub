package com.beautyhub.mappers;

import com.beautyhub.dto.ReviewsDTO;
import com.beautyhub.entities.Reviews;
import org.springframework.stereotype.Component;

@Component
public class ReviewsMapper {

    public Reviews toEntity(ReviewsDTO dto) {
        if (dto == null) {
            return null;
        }
        Reviews entity = new Reviews();
        entity.setId(dto.getId());
        entity.setUserId(dto.getUserId());
        entity.setMasterId(dto.getMasterId());
        entity.setRating(dto.getRating());
        entity.setReviewText(dto.getReviewText());
        return entity;
    }

    public ReviewsDTO toDTO(Reviews entity) {
        if (entity == null) {
            return null;
        }
        return new ReviewsDTO(
                entity.getId(),
                entity.getUserId(),
                entity.getMasterId(),
                entity.getRating(),
                entity.getReviewText()
        );
    }
}
