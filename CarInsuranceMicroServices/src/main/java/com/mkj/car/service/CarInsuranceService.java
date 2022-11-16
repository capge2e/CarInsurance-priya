package com.mkj.car.service;

import java.util.List;




import org.springframework.stereotype.Service;
import com.mkj.car.entity.CarInsurance;


@Service
public interface CarInsuranceService {
	
	public CarInsurance addCarInsurance(CarInsurance carInsurance)throws Exception;
	public List<CarInsurance> getAllCarInsurance()throws Exception;
	public CarInsurance getCarInsuranceBySumInsured(int sumInsured) throws Exception;
	public CarInsurance getCarInsuranceByInsuranceName(String insuranceName)throws Exception;
	public List<CarInsurance> getCarInsuranceByPremium(int premium) throws Exception;
	public CarInsurance updateCarInsurance(CarInsurance carInsurance)throws Exception;
	public void deleteInsuranceByCId(int cId)throws Exception;
	public List<CarInsurance> findCarInsuranceWithSorting(String field)throws Exception;
	public List<CarInsurance> filterByInsuranaceName(String insuranceName)throws Exception;
	
	public CarInsurance getInsuranceById(int id);

	public List<CarInsurance> sortingBasedOnPremium()throws Exception;




	

	


	
	
	
	
	
	

}
