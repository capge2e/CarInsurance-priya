package com.mkj.car.sort;

import java.util.Comparator;

import com.mkj.car.entity.CarInsurance;

public class SortingBasedOnPremiumHighToLow implements Comparator<CarInsurance>{

	@Override
	public int compare(CarInsurance o1, CarInsurance o2) {
		// TODO Auto-generated method stub
	
		return o2.getPremium()-o1.getPremium();
	}

}
