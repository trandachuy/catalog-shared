package com.mediastep.beecow.catalog.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.mediastep.beecow.catalog.dto.view.DistrictView;
import lombok.*;

import java.io.Serializable;

/**
 * A DTO for the District entity.
 */
@Data
@EqualsAndHashCode(of = "id")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DistrictDTO implements Serializable {

    @JsonView(DistrictView.Simple.class)
    private Long id;

    @JsonView(DistrictView.Simple.class)
    private String code;

    @JsonView(DistrictView.Simple.class)
    private String inCountry;

    @JsonView(DistrictView.Simple.class)
    private String outCountry;

    @JsonView(DistrictView.Simple.class)
    private String zone;

    @JsonView(DistrictView.Detail.class)
    private Long cityId;

}
