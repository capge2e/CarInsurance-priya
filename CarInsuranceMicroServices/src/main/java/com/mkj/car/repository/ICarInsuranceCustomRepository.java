package com.mkj.car.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mkj.car.entity.CarInsurance;

@Repository
public interface ICarInsuranceCustomRepository  {
	
	
	public List<CarInsurance> getAllCarInsuranceByPremium(int Premium)throws Exception;
	public CarInsurance  getCarInsuranceBysumInsured(int sumInsured)throws Exception;
	public CarInsurance getCarInsuranceByInsuranceName(String insuranceName)throws Exception;
	

}
