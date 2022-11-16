package com.mkj.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkj.car.entity.CarPolicies;

@Repository
public interface CarPoliciesRepository extends JpaRepository<CarPolicies, Integer> ,ICarPoliciesCustomRepository {

}
