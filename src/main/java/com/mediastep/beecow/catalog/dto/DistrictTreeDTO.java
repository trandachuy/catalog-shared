package com.mediastep.beecow.catalog.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type District tree dto.
 */
@Data
public class DistrictTreeDTO extends DistrictDTO implements ILocation {
    private static final long serialVersionUID = 1L;

    private List<WardNewDTO> wards = new ArrayList<>();

    /**
     * From district dto district tree dto.
     *
     * @param districtDTO the district dto
     * @return the district tree dto
     */
    public static DistrictTreeDTO fromDistrictDTO(DistrictDTO districtDTO) {
        DistrictTreeDTO districtTreeDTO = new DistrictTreeDTO();
        districtTreeDTO.setId(districtDTO.getId());
        districtTreeDTO.setCityId(districtDTO.getCityId());
        districtTreeDTO.setCode(districtDTO.getCode());
        districtTreeDTO.setInCountry(districtDTO.getInCountry());
        districtTreeDTO.setOutCountry(districtDTO.getOutCountry());
        districtTreeDTO.setZone(districtDTO.getZone());

        return districtTreeDTO;
    }
}
