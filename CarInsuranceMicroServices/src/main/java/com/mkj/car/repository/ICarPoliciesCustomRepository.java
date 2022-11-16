package com.mkj.car.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mkj.car.entity.CarPolicies;
@Repository
public interface ICarPoliciesCustomRepository {
	
	@Query("from CarPolicies where carPolicyNo >= :range1 and carPolicyNo <= :range2")
	public List<CarPolicies> getCarPoliciesBetweenCarPolicyNo(@Param("range1") int range1,@Param("range2") int range2)throws Exception;
	public CarPolicies getCarPoliciesByClientName(String clientName)throws Exception;
	

}
