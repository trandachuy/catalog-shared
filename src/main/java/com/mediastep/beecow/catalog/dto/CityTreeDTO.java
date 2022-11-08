package com.mediastep.beecow.catalog.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type City tree dto.
 */
@Data
public class CityTreeDTO extends CitySimpleDTO implements ILocation {
    private static final long serialVersionUID = 1L;

    private List<DistrictTreeDTO> districts = new ArrayList<>();

    /**
     * From city simple dto city tree dto.
     *
     * @param citySimpleDTO the city simple dto
     * @return the city tree dto
     */
    public static CityTreeDTO fromCitySimpleDTO(CitySimpleDTO citySimpleDTO) {
        CityTreeDTO cityTreeDTO = new CityTreeDTO();
        cityTreeDTO.setCode(citySimpleDTO.getCode());
        cityTreeDTO.setInCountry(citySimpleDTO.getInCountry());
        cityTreeDTO.setOutCountry(citySimpleDTO.getOutCountry());

        return cityTreeDTO;
    }
}
