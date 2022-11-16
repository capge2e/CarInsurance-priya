package com.mkj.car.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkj.car.entity.CarInsurance;
import com.mkj.car.service.CarInsuranceService;
@RestController
@RequestMapping("/public/insurance")
public class PublicController {
	
		@Autowired
		CarInsuranceService carInsuranceService;
		
		@GetMapping("/viewCarInsurance")//....localhost:8009/public/insurance/viewCarInsurance
		public List<CarInsurance> viewAllInsurance()
		{

			try {
				List<CarInsurance>  allExtractedInsurance =carInsuranceService.getAllCarInsurance();

				return allExtractedInsurance;

			} catch (Exception e) {

				System.out.println(e);

			}

			return null;
		}
		@GetMapping("/sumInsured/{sumInsured}") //....localhost:8009/public/insurance/sumInsured/80000	
		
		public CarInsurance getHomeInsuranceBySumInsured(@PathVariable int sumInsured)throws Exception
		{

			return carInsuranceService.getCarInsuranceBySumInsured(sumInsured);

		}

		@GetMapping("/premium/{premium}")//.........localhost:8009/public/insurance/premium/7000
		public List<CarInsurance> getCarInsuranceByPremiumamount(@PathVariable  int premium) throws Exception
		{

			return  carInsuranceService.getCarInsuranceByPremium(premium);

		}


	    @GetMapping("/insuranceName/{name}")//...localhost:8009/safeInsurance/admin/carInsurance/insuranceName
	    public CarInsurance getCarInsuranceByInsuranceName(@PathVariable String insuranceName) throws Exception
	    {
	    	return carInsuranceService.getCarInsuranceByInsuranceName(insuranceName);
	    }

	

}
