package com.mkj.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkj.car.entity.CarInsurance;

@Repository
public interface CarInsuranceRepository extends JpaRepository<CarInsurance, Integer > ,ICarInsuranceCustomRepository{

}
