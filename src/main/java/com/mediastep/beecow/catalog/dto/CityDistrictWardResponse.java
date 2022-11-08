package com.mediastep.beecow.catalog.dto;

import com.mediastep.beecow.common.dto.CityDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CityDistrictWardResponse {
    DistrictDTO districtDTO;
    CityDTO cityDTO;
    WardNewDTO wardNewDTO;
}
