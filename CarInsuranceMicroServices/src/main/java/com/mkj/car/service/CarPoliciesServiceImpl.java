package com.mkj.car.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mkj.car.entity.CarInsurance;
import com.mkj.car.entity.CarPolicies;
import com.mkj.car.repository.CarPoliciesRepository;


@Service
public class CarPoliciesServiceImpl implements CarPoliciesService {
	@Autowired
	CarPoliciesRepository carpoliciesRepository;

	@Override
	@Transactional
	public CarPolicies addCarPolicies(CarPolicies carPolicies) throws Exception {
		// TODO Auto-generated method stub
		CarPolicies savedCarPolicy =carpoliciesRepository.save(carPolicies);
		return  savedCarPolicy;
	}


	@Override
	public List<CarPolicies> getCarPoliciesBetweenCarPolicyNo(int range1, int range2) throws Exception {
		// TODO Auto-generated method stub
		return  carpoliciesRepository.getCarPoliciesBetweenCarPolicyNo(range1, range2);
		
	}

	@Override
	public CarPolicies getCarPoliciesByClientName(String clientName) throws Exception {
		// TODO Auto-generated method stub
		 CarPolicies outPut =  carpoliciesRepository.getCarPoliciesByClientName(clientName);

			if(outPut == null)
			{
				throw new EntityNotFoundException(outPut+" not listed in the database");
			}
			else
			{
				return outPut;
			}
		
	}



	@Override
	public List<CarPolicies> viewAllPolicies() throws Exception {
		// TODO Auto-generated method stub
		List<CarPolicies> allPolicies = carpoliciesRepository.findAll(); // Note : same as save
		return allPolicies;
		
	}


	@Override
	@Transactional
	public CarPolicies linkCarInsurance(CarInsurance carInsurance, CarPolicies carPolicies) {
		// TODO Auto-generated method stub
	
		carPolicies.setCarInsurances(carInsurance);
		return carPolicies;
	}


	@Override
	public CarPolicies updateCarPolicies(CarPolicies carPolicies) throws Exception {
		// TODO Auto-generated method stub
		return carpoliciesRepository.save(carPolicies);
	
	}


	@Override
	public void deleteCarPoliciesByCarPolicyId(int carPolicyId) throws Exception {
		// TODO Auto-generated method stub
		carpoliciesRepository.deleteById(carPolicyId);
		
	}


	@Override
	public List<CarPolicies> findCarPoliciesWithSorting(String field) throws Exception {
		// TODO Auto-generated method stub
		return carpoliciesRepository.findAll(Sort.by(Sort.Direction.DESC,field));
		
	}



	



}
