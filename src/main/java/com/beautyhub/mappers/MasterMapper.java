package com.beautyhub.mappers;

import com.beautyhub.dto.MasterDTO;
import com.beautyhub.entities.Master;
import org.springframework.stereotype.Component;

@Component
public class MasterMapper {

    public MasterDTO toDTO(Master master) {
        if (master == null) return null;

        MasterDTO dto = new MasterDTO();
        dto.setId(master.getId());
        dto.setFirstName(master.getFirstName());
        dto.setLastName(master.getLastName());
        dto.setEmail(master.getEmail());
        dto.setPhone(master.getPhone());
        dto.setPassword(master.getPassword());
        dto.setCity(master.getCity());
        dto.setComment(master.getComment());
        dto.setHomeVisit(master.getHomeVisit());
        dto.setSanPinCompliance(master.getSanPinCompliance());
        return dto;
    }

    public Master toEntity(MasterDTO dto) {
        if (dto == null) return null;

        Master master = new Master();
        master.setId(dto.getId());
        master.setFirstName(dto.getFirstName());
        master.setLastName(dto.getLastName());
        master.setEmail(dto.getEmail());
        master.setPhone(dto.getPhone());
        master.setPassword(dto.getPassword());
        master.setCity(dto.getCity());
        master.setComment(dto.getComment());
        master.setHomeVisit(dto.getHomeVisit());
        master.setSanPinCompliance(dto.getSanPinCompliance());
        return master;
    }

    public void updateEntityFromDTO(MasterDTO dto, Master master) {
        if (dto == null || master == null) return;

        master.setFirstName(dto.getFirstName());
        master.setLastName(dto.getLastName());
        master.setEmail(dto.getEmail());
        master.setPhone(dto.getPhone());
        master.setPassword(dto.getPassword());
        master.setCity(dto.getCity());
        master.setComment(dto.getComment());
        master.setHomeVisit(dto.getHomeVisit());
        master.setSanPinCompliance(dto.getSanPinCompliance());
    }
}
