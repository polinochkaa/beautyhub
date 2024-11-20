package com.beautyhub.controllers;

import com.beautyhub.dto.MasterDTO;
import com.beautyhub.services.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masters")
public class MasterController {

    @Autowired
    private MasterService masterService;

    @GetMapping
    public List<MasterDTO> getAllMasters() {
        return masterService.getAllMasters();
    }

    @GetMapping("/{id}")
    public MasterDTO getMasterById(@PathVariable Long id) {
        return masterService.getMasterById(id);
    }

    @PostMapping
    public MasterDTO createMaster(@RequestBody MasterDTO masterDTO) {
        return masterService.createMaster(masterDTO);
    }

    @PutMapping("/{id}")
    public MasterDTO updateMaster(@PathVariable Long id, @RequestBody MasterDTO masterDTO) {
        return masterService.updateMaster(id, masterDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMaster(@PathVariable Long id) {
        masterService.deleteMaster(id);
        return ResponseEntity.noContent().build();
    }
}
