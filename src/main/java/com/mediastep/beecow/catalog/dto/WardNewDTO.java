package com.mediastep.beecow.catalog.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.mediastep.beecow.catalog.dto.view.WardView;
import lombok.*;

import java.io.Serializable;

/**
 * A DTO for the Ward entity.
 */

@Data
@EqualsAndHashCode(of = "id")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WardNewDTO implements ILocation, Serializable {

    @JsonView(WardView.Simple.class)
    private Long id;

    @JsonView(WardView.Simple.class)
    private String code;

    @JsonView(WardView.Simple.class)
    private String inCountry;

    @JsonView(WardView.Simple.class)
    private String outCountry;

    @JsonView(WardView.Detail.class)
    private Long districtId;

}
