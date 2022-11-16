package com.mkj.car.service;


import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.mkj.car.entity.CarInsurance;
import com.mkj.car.entity.CarPolicies;

@Service
public interface CarPoliciesService {
	public CarPolicies addCarPolicies(CarPolicies carPolicies)throws Exception;
	public List<CarPolicies> getCarPoliciesBetweenCarPolicyNo(@Param("range1") int range1,@Param("range2") int range2)throws Exception;
	public CarPolicies getCarPoliciesByClientName(String clientName)throws Exception;
	public List<CarPolicies> viewAllPolicies()throws Exception;
	public CarPolicies linkCarInsurance(CarInsurance carInsurance, CarPolicies  carPolicies);
	public CarPolicies updateCarPolicies(CarPolicies carPolicies)throws Exception;
	public void deleteCarPoliciesByCarPolicyId(int carPolicyId)throws Exception;
	public List<CarPolicies> findCarPoliciesWithSorting(String field)throws Exception;
}
