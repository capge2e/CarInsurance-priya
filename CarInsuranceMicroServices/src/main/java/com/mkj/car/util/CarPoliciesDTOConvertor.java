package com.mkj.car.util;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

import com.mkj.car.dto.DefaultResponseDTO;
import com.mkj.car.entity.CarPolicies;

@Component
@Scope("singleton")
public class CarPoliciesDTOConvertor {
	
	public static DefaultResponseDTO  getCarPolicieseDefaultDTO(CarPolicies carpolicies)
	{
		DefaultResponseDTO dto = new DefaultResponseDTO(
				carpolicies.getClientName(),
				carpolicies.getCpolicyId(),
				carpolicies.getCarInsurance().getInsuranceName(),
				"Client policies Added,Car Insurance Id:"+carpolicies.getCarInsurance().getcId());
				
				
			

		return dto;
	}



}
