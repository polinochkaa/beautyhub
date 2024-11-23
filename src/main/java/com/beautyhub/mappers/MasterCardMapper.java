package com.beautyhub.mappers;

import com.beautyhub.dto.MasterCardDTO;
import com.beautyhub.entities.MasterCard;
import org.springframework.stereotype.Component;

@Component
public class MasterCardMapper {

    public MasterCard toEntity(MasterCardDTO dto) {
        if (dto == null) {
            return null;
        }
        MasterCard entity = new MasterCard();
        entity.setMasterId(dto.getMasterId());
        entity.setPhotoLinks(dto.getPhotoLinks());
        entity.setMessengerLinks(dto.getMessengerLinks());
        entity.setBookingLink(dto.getBookingLink());
        entity.setExperienceYears(dto.getExperienceYears());
        entity.setCity(dto.getCity());
        entity.setServices(dto.getServices());
        entity.setHomeVisit(dto.getHomeVisit());
        entity.setComment(dto.getComment());
        entity.setSanPinCompliance(dto.getSanPinCompliance());
        return entity;
    }

    public MasterCardDTO toDTO(MasterCard entity) {
        if (entity == null) {
            return null;
        }
        MasterCardDTO dto = new MasterCardDTO();
        dto.setMasterId(entity.getMasterId());
        dto.setPhotoLinks(entity.getPhotoLinks());
        dto.setMessengerLinks(entity.getMessengerLinks());
        dto.setBookingLink(entity.getBookingLink());
        dto.setExperienceYears(entity.getExperienceYears());
        dto.setCity(entity.getCity());
        dto.setServices(entity.getServices());
        dto.setHomeVisit(entity.getHomeVisit());
        dto.setComment(entity.getComment());
        dto.setSanPinCompliance(entity.getSanPinCompliance());
        return dto;
    }
}
