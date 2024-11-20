package com.beautyhub.controllers;

import com.beautyhub.dto.MasterCardDTO;
import com.beautyhub.services.MasterCardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/master-cards")
public class MasterCardController {
    private final MasterCardService service;

    public MasterCardController(MasterCardService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<MasterCardDTO> create(@RequestBody MasterCardDTO masterCardDTO) {
        return ResponseEntity.ok(service.createMasterCard(masterCardDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MasterCardDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getMasterCardById(id));
    }

    @GetMapping("/by-city")
    public ResponseEntity<List<MasterCardDTO>> getByCity(@RequestParam String city) {
        return ResponseEntity.ok(service.getMasterCardsByCity(city));
    }

    @GetMapping("/by-master/{masterId}")
    public ResponseEntity<List<MasterCardDTO>> getByMasterId(@PathVariable Long masterId) {
        return ResponseEntity.ok(service.getMasterCardsByMasterId(masterId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MasterCardDTO> update(@PathVariable Long id, @RequestBody MasterCardDTO masterCardDTO) {
        return ResponseEntity.ok(service.updateMasterCard(id, masterCardDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteMasterCard(id);
        return ResponseEntity.noContent().build();
    }
}
