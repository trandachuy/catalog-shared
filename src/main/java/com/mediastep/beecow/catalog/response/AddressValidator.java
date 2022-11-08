package com.mediastep.beecow.catalog.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressValidator {

    private static final long serialVersionUID = 1L;

    private String defaultMessage;

    private String entityName;

    private String errorKey;

    private int errorCode;

}
