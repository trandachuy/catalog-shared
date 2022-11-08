package com.mediastep.beecow.catalog.dto;

import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the Ward entity.
 *
 * @deprecated Use DistrictDTO instead
 */
@Deprecated
public class WardDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String code;

    private String inCountry;

    private String outCountry;

    private String zone;


    private Long cityId;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets in country.
     *
     * @return the in country
     */
    public String getInCountry() {
        return inCountry;
    }

    /**
     * Sets in country.
     *
     * @param inCountry the in country
     */
    public void setInCountry(String inCountry) {
        this.inCountry = inCountry;
    }

    /**
     * Gets out country.
     *
     * @return the out country
     */
    public String getOutCountry() {
        return outCountry;
    }

    /**
     * Sets out country.
     *
     * @param outCountry the out country
     */
    public void setOutCountry(String outCountry) {
        this.outCountry = outCountry;
    }

    /**
     * Gets zone.
     *
     * @return the zone
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets zone.
     *
     * @param zone the zone
     */
    public void setZone(String zone) {
        this.zone = zone;
    }

    /**
     * Gets city id.
     *
     * @return the city id
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * Sets city id.
     *
     * @param cityId the city id
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        WardDTO wardDTO = (WardDTO) o;

        if ( ! Objects.equals(id, wardDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "WardDTO{" +
            "id=" + id +
            ", code='" + code + "'" +
            ", inCountry='" + inCountry + "'" +
            ", outCountry='" + outCountry + "'" +
            ", zone='" + zone + "'" +
            '}';
    }
}
