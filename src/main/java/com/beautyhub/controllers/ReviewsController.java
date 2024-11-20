package com.beautyhub.controllers;

import com.beautyhub.dto.ReviewsDTO;
import com.beautyhub.services.ReviewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewsController {
    private final ReviewsService service;

    public ReviewsController(ReviewsService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ReviewsDTO> create(@RequestBody ReviewsDTO reviewsDTO) {
        return ResponseEntity.ok(service.createReview(reviewsDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReviewsDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getReviewById(id));
    }

    @GetMapping("/by-master/{masterId}")
    public ResponseEntity<List<ReviewsDTO>> getByMasterId(@PathVariable Long masterId) {
        return ResponseEntity.ok(service.getReviewsByMasterId(masterId));
    }

    @GetMapping("/by-user/{userId}")
    public ResponseEntity<List<ReviewsDTO>> getByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(service.getReviewsByUserId(userId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReviewsDTO> update(@PathVariable Long id, @RequestBody ReviewsDTO reviewsDTO) {
        return ResponseEntity.ok(service.updateReview(id, reviewsDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteReview(id);
        return ResponseEntity.noContent().build();
    }
}
