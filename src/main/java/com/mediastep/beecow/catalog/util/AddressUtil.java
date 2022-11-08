package com.mediastep.beecow.catalog.util;

import com.mediastep.beecow.catalog.dto.*;
import com.mediastep.beecow.catalog.response.AddressResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class AddressUtil {
	public static final Logger log = LoggerFactory.getLogger(AddressUtil.class);

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	public static class OptionalAddressFields {
		private String address2;

		private String city;

		private String zipCode;

		private boolean hideCountry;
	}

	public static String buildAddress(List<CityTreeDTO> cityTreeDTOs, String cityCode, String districtCode, String wardCode, String address) {
		List<String> lstAddress = new ArrayList();
		CityTreeDTO cityTreeDTO = cityTreeDTOs.stream().filter(city -> city.getCode().equalsIgnoreCase(cityCode)).findFirst().orElse(null);
		DistrictTreeDTO districtTreeDTO = null;

		if (cityTreeDTO != null) {
			lstAddress.add(cityTreeDTO.getInCountry());
			districtTreeDTO = cityTreeDTO.getDistricts().stream().filter(district -> district.getCode().equalsIgnoreCase(districtCode)).findFirst().orElse(null);
		}

		if (districtTreeDTO != null) {
			lstAddress.add(districtTreeDTO.getInCountry());
			WardNewDTO wardNewDTO = districtTreeDTO.getWards().stream().filter(ward -> ward.getCode().equalsIgnoreCase(wardCode)).findFirst().orElse(null);
			if (wardNewDTO != null) {
				lstAddress.add(wardNewDTO.getInCountry());
			}
		}

		if (StringUtils.isNotBlank(address)) {
			lstAddress.add(address);
		}

		Collections.reverse(lstAddress);

		return lstAddress.stream().collect(Collectors.joining(", "));
	}

	private static String buildAddressInside(CountrySimpleDTO country, CitySimpleDTO city, DistrictDTO district, WardNewDTO ward, String address) {
		List<String> lstAddress = new ArrayList();

		if (!Objects.isNull(country)) {
			lstAddress.add(country.getInCountry());
		}
		if (!Objects.isNull(city)) {
			lstAddress.add(city.getInCountry());
		}
		if (!Objects.isNull(district)) {
			lstAddress.add(district.getInCountry());
		}
		if (!Objects.isNull(ward)) {
			lstAddress.add(ward.getInCountry());
		}
		if (StringUtils.isNotBlank(address)) {
			lstAddress.add(address);
		}

		Collections.reverse(lstAddress);

		return lstAddress.stream().collect(Collectors.joining(", "));
	}

	private static String buildAddressOutside(CountrySimpleDTO country, CitySimpleDTO city, String address, String address2, String outsideCity, String zipCode) {
		List<String> lstAddress = new ArrayList();

		if (!Objects.isNull(country)) {
			lstAddress.add(country.getOutCountry());
		}

		if (StringUtils.isNotBlank(zipCode)) {
			lstAddress.add(zipCode);
		}

		if (!Objects.isNull(city)) {
			lstAddress.add(city.getOutCountry());
		}

		if (StringUtils.isNotBlank(outsideCity)) {
			lstAddress.add(outsideCity);
		}

		if (StringUtils.isNotBlank(address2)) {
			lstAddress.add(address2);
		}

		if (StringUtils.isNotBlank(address)) {
			lstAddress.add(address);
		}

		Collections.reverse(lstAddress);

		return lstAddress.stream().collect(Collectors.joining(", "));
	}

	public static String buildAddressWithCountry(CountrySimpleDTO country, CitySimpleDTO city, DistrictDTO district, WardNewDTO ward, String address, OptionalAddressFields optionalFields) {
		if (!Objects.isNull(country) && !"VN".equalsIgnoreCase(country.getCode())) {
			if (Objects.isNull(optionalFields)) {
				optionalFields = new OptionalAddressFields();
			}

			return buildAddressOutside(optionalFields.hideCountry ? null : country, city, address, optionalFields.getAddress2(), optionalFields.getCity(), optionalFields.zipCode);
		}

		return buildAddressInside(optionalFields.hideCountry ? null : country, city, district, ward, address);
	}

	public static Optional<AddressResponse> getAddressResponse(List<AddressResponse> responses, String countryCode, String city, String district, String ward) {
		return responses.parallelStream().filter(r -> {
			boolean isValid = true;
			boolean isExist = false;

			if (!Objects.isNull(r.getCountry()) && StringUtils.isNotBlank(countryCode)) {
				isValid = isValid && Objects.equals(r.getCountry().getCode(), countryCode);
				isExist = true;
			}
			if (!Objects.isNull(r.getCity()) && StringUtils.isNotBlank(city)) {
				isValid = isValid && Objects.equals(r.getCity().getCode(), city);
				isExist = true;
			}
			if (!Objects.isNull(r.getDistrict()) && StringUtils.isNotBlank(district)) {
				isValid = isValid && Objects.equals(r.getDistrict().getCode(), district);
				isExist = true;
			}
			if (!Objects.isNull(r.getWard()) && StringUtils.isNotBlank(ward)) {
				isValid = isValid && Objects.equals(r.getWard().getCode(), ward);
				isExist = true;
			}

			return isValid && isExist;
		}).findFirst();
	}
}
