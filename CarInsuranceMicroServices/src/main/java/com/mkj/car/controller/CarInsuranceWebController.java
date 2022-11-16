package com.mkj.car.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mkj.car.dto.DefaultResponseDTO;
import com.mkj.car.dto.ErrorDTO;
import com.mkj.car.dto.InsuranceResponseDTO;
import com.mkj.car.dto.MyDTO;
import com.mkj.car.entity.CarInsurance;
import com.mkj.car.entity.CarPolicies;
import com.mkj.car.service.CarInsuranceService;
import com.mkj.car.service.CarPoliciesService;
import com.mkj.car.util.CarInsuranceDTOConvertor;
import com.mkj.car.util.CarPoliciesDTOConvertor;

@RestController
@RequestMapping("admin/carInsurance")
public class CarInsuranceWebController {
	@Autowired
	CarInsuranceService carInsuranceService;

	@Autowired
	CarPoliciesService carPoliciesService;

	@Autowired
	CarPoliciesDTOConvertor dtoConvertor;

	@Autowired
	CarInsuranceDTOConvertor ciDTOConvertor;

	private final Logger mylogs = LoggerFactory.getLogger(this.getClass());

	public CarInsuranceWebController() {
		System.out.println("\n\n\n====>> Inside Constructor " + this);
	}

	@PostMapping("/addinsurance") // ....../localhost:8006/admin/carInsurance/addinsurance
	public ResponseEntity<MyDTO> doCarInsuranceThings(@RequestBody @Valid CarInsurance carInsurance) throws Exception {

		System.out.println("\n\n--->> Inside controller CI :- " + carInsurance);
		CarInsurance savedInsurance = carInsuranceService.addCarInsurance(carInsurance);
		InsuranceResponseDTO respDTO = ciDTOConvertor.convertToDTO(savedInsurance);
		return new ResponseEntity<MyDTO>(respDTO, HttpStatus.OK);

	}

	@GetMapping("/viewCarInsurance") // localhost:8006/admin/carInsurance/viewCarInsurance
	public List<CarInsurance> viewAllInsurance() {

		try {
			List<CarInsurance> allExtractedInsurance = carInsuranceService.getAllCarInsurance();

			return allExtractedInsurance;

		} catch (Exception e) {

			System.out.println(e);

		}

		return null;
	}

	@PutMapping("/update") // localhost:8006/admin/carInsurance/update
	public CarInsurance updateCarInsurance(@RequestBody CarInsurance carInsurance) throws Exception {

		return carInsuranceService.updateCarInsurance(carInsurance);

	}

	@DeleteMapping("/delete") // localhost:8006/admin/carInsurance/delete?cId=3
	public String deleteCarInsurance(@RequestParam int cId) throws Exception {

		carInsuranceService.deleteInsuranceByCId(cId);
		mylogs.info("Deleted Insurance=" + cId + "Data");
		return "Deleted id =" + cId + "Data";
	}

	@GetMapping("/IPremium/{premium}") // localhost:8006/admin/carInsurance/IPremium/8000
	public List<CarInsurance> getAllCarInsuranceByPremium(@PathVariable int premium) throws Exception {

		return carInsuranceService.getCarInsuranceByPremium(premium);

	}

	@GetMapping("/sumInsured/{sumInsured}") // localhost:8006/admin/carInsurance/sumInsured
	public CarInsurance getCarInsuranceBysumInsured(@PathVariable int sumInsured) throws Exception {
		return carInsuranceService.getCarInsuranceBySumInsured(sumInsured);

	}

	@GetMapping("/insuranceName/{name}") // localhost:8006/admin/carInsurance/insuranceName
	public CarInsurance getCarInsuranceByinsuranceName(@PathVariable String insurancename) throws Exception {

		return carInsuranceService.getCarInsuranceByInsuranceName(insurancename);

	}

	@GetMapping("/{field}") // here field can be anything like insurancename,suminsured,premium..
	public List<CarInsurance> getCarInsuranceWithSort(@PathVariable String field) throws Exception {
		List<CarInsurance> allCarInsurance = carInsuranceService.findCarInsuranceWithSorting(field);
		return allCarInsurance;
	}

	@GetMapping("/filterInsuranceName/{insuranceName}") // localhost:8006/admin/carInsurance/filterInsuranceName/third
														// party...insurancename can be entered
	public List<CarInsurance> filterInsurance(@PathVariable String insuranceName) throws Exception {
		List<CarInsurance> allfiltered = carInsuranceService.filterByInsuranaceName(insuranceName);
		return allfiltered;
	}

	@GetMapping("/sort/premium") // localhost:8006/admin/carInsurance/sort/premium
	public List<CarInsurance> getBySorting() throws Exception {
		List<CarInsurance> allCarInsurance = carInsuranceService.sortingBasedOnPremium();
		return allCarInsurance;
	}

}
