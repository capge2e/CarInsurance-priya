package com.mkj.car.util;

import org.springframework.stereotype.Component;

import com.mkj.car.dto.InsuranceResponseDTO;
import com.mkj.car.entity.CarInsurance;

@Component
public class CarInsuranceDTOConvertor {
	

	public InsuranceResponseDTO convertToDTO(CarInsurance ci)
	{
		return new InsuranceResponseDTO(ci.getcId(), ci.getInsuranceName());
	}

}
