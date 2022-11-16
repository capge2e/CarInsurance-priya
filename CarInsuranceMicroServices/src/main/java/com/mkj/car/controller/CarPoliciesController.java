package com.mkj.car.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mkj.car.entity.CarInsurance;
import com.mkj.car.entity.CarPolicies;
import com.mkj.car.service.CarInsuranceService;
import com.mkj.car.service.CarPoliciesService;

@RestController
@RequestMapping("/policy/client/cpolicies")
@Validated
public class CarPoliciesController {

	@Autowired
	CarPoliciesService carPoliciesService;

	@Autowired
	CarInsuranceService carInsuranceService;

	@GetMapping("/welcome")
	public String welcome() {

		return "Welcome to car Policies";

	}

	private final Logger mylogs = LoggerFactory.getLogger(this.getClass());
	
	// /policy/client/cpolicies/addCarPolicies/2?clientName=Ram
	
	@PostMapping("/addCarPolicies/{cid}") //@RequestParam int userId
	public ResponseEntity<String> addHomePolicies(@RequestBody CarPolicies carPolicies,@PathVariable int cid,@RequestParam String clientName) {
		
		CarInsurance clientSelectedCarInsurance = carInsuranceService.getInsuranceById(cid);
		

		//  InsuranceClient client = aruna code to get client by clientUsername  , through RestTemplate 

		carPolicies.setCarInsurances(clientSelectedCarInsurance); // have to be removed and replace with line 52
		carPolicies.setClientName(clientName);


		try {
			System.out.println(" --- > " + mylogs);
			mylogs.info("---->>>Inside try of adding car insurance");
			CarPolicies savedPolicies = carPoliciesService.addCarPolicies(carPolicies);
			String responseMsg = savedPolicies.getClientName() + "   save with premium:   "
					+ savedPolicies.getCarPolicyNo();
			return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg = " Please, Contact to customer care 1800-250-960 or mail us :- care@gmail.com";
			return new ResponseEntity<String>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/viewAllPolices")//localhost:8006/policy/client/cpolicies/viewAllPolices
	public List<CarPolicies> viewAllCarPolicies() {

		try {
			List<CarPolicies> allExtractedPolicies = carPoliciesService.viewAllPolicies();

			return allExtractedPolicies;

		} catch (Exception e) {

			System.out.println(e);

		}

		return null;
	}
	@GetMapping("/policiesByPolicyNo") // localhost:8006/policy/client/cpolicies/policiesByPolicyNo?r1=20&r2=30
	public List<CarPolicies> policiesBetweenPolicyNo(@RequestParam int r1, @RequestParam int r2) throws Exception {

		return carPoliciesService.getCarPoliciesBetweenCarPolicyNo(r1, r2);
	}

	@GetMapping("/clientName/{clientName}") // localhost:8006/policy/client/cpolicies/clientName/pri
	public CarPolicies getByClientName(@PathVariable String clientName) throws Exception {
		return carPoliciesService.getCarPoliciesByClientName(clientName);
	}

	@PutMapping("/updateCarPolicies") // .........localhost:8006/policy/client/cpolicies/updateCarPolicies
	public CarPolicies updateCarPolicies(@RequestBody CarPolicies carPolicies) throws Exception {

		return carPoliciesService.updateCarPolicies(carPolicies);

	}

	@DeleteMapping("/deleteCarPolicies") // .....localhost:8006/policy/client/cpolicies/deletecarPolicies?carpolicyId=2..cannot
											// do bcoz of foreign key
	public String deleteCarPolicies(@RequestParam int carPolicyId) throws Exception {
		carPoliciesService.deleteCarPoliciesByCarPolicyId(carPolicyId);
		mylogs.info("Deleted Policies=" + carPolicyId + "Data");
		return "Deleted id =" + carPolicyId + "Data";
	}

	@GetMapping("/{field}") // ..localhost:8005/policy/client/cpolicies/carPolicyNo
	public List<CarPolicies> getCarPoliciesWithSort(@PathVariable String field) throws Exception {
		List<CarPolicies> allcarPolicies = carPoliciesService.findCarPoliciesWithSorting(field);
		return allcarPolicies;
	}

}
