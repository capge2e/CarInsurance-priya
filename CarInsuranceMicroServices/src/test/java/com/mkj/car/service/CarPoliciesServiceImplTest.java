package com.mkj.car.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mkj.car.entity.CarPolicies;
import com.mkj.car.repository.CarPoliciesRepository;
@SpringBootTest
class CarPoliciesServiceImplTest {
	
	@Mock
	CarPoliciesRepository carPoliciesRepository;
	
	@InjectMocks
	CarPoliciesServiceImpl carPoliciesService;

	@Test
	//@Disabled
	@DisplayName("Test - to verify the insert operation")
	void testAddCarPolicies() throws Exception {
		// given
		CarPolicies sampleInput = new CarPolicies(40, 1, "pri", "15-06-2002", "25-08-2004", "yes", "10-06-2008");
		CarPolicies expectedOutput = new CarPolicies(40, 1, "Raj", "11-06-2002", "15-08-2004", "yes", "05-04-2007");
		//Object obj = new Object();
		BDDMockito.given(carPoliciesService.addCarPolicies(sampleInput)).willReturn(expectedOutput);
		
		// when 
	  CarPolicies  actualOutput = carPoliciesService.addCarPolicies(sampleInput);
		
		// verify 
		assertEquals(expectedOutput, actualOutput);
}

		
	

	@Test
	//@Disabled
	@DisplayName(" Test to check policies between policy no")
	void testGetCarPoliciesBetweenCarPolicyNo() throws Exception {
		// give 
		
		CarPolicies policies1=new CarPolicies(40, 1, "pri", "15-06-2002", "25-08-2004", "yes", "10-06-2008");  
		policies1.setCarInsurances(null);
				
				
		CarPolicies policies2=new CarPolicies(30, 2, "Raj", "15-06-2002", "25-08-2004", "yes", "10-06-2008");  
		policies2.setCarInsurances(null);
				
				List<CarPolicies> sampleOutput = new ArrayList<>();
				sampleOutput.add(policies1);
				sampleOutput.add(policies2);
				
				int sampleInput1 = 432;
				int sampleInput2 = 490;
				
				
				BDDMockito.given(carPoliciesService.getCarPoliciesBetweenCarPolicyNo(sampleInput1, sampleInput2))
				          .willReturn(sampleOutput);
				
				
				// when 
				
				List<CarPolicies> actualOutput = carPoliciesService.getCarPoliciesBetweenCarPolicyNo(sampleInput1, sampleInput2);
				
				
				// verify 
				assertEquals(sampleOutput, actualOutput);
				assertIterableEquals(sampleOutput, actualOutput);
				assertNotNull(actualOutput);
}
		
		
	

	@Test
	@Disabled
	void testGetCarPoliciesByClientName() {
		fail("Not yet implemented");
	}

	@Test
	//@Disabled
	@DisplayName("Test to verify all policies returend")
	void testViewAllPolicies() throws Exception {
		// given
		
				CarPolicies policies1=new CarPolicies( 40, 1, "pri", "15-06-2002", "25-08-2004", "yes", "10-06-2008");  

				
				policies1.setCarInsurances(null);
				
				CarPolicies policies2=new CarPolicies( 40, 2, "Raj", "15-06-2002", "25-08-2004", "yes", "10-06-2008"); 
				policies2.setCarInsurances(null);
				
				
				
				List<CarPolicies> sampleOutput = new ArrayList<>();
				sampleOutput.add(policies1);
				sampleOutput.add(policies1);
				
				BDDMockito.given(carPoliciesService.viewAllPolicies()).willReturn(sampleOutput);
				
				// ----------------------------------------------------------------------
				
				// when :- readyto test the funcationality (service)
				List<CarPolicies> actualOutput = carPoliciesService.viewAllPolicies();
				
				
				// then : verify the sampleOutput with actual output
				
				assertNotNull(actualOutput);
				assertThat(actualOutput.size()).isGreaterThan(0);
				assertIterableEquals(sampleOutput, actualOutput);
			}

		
	

	@Test
	@Disabled
	void testLinkCarInsurance() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testUpdateCarPolicies() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testDeleteCarPoliciesByCarPolicyId() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testFindCarPoliciesWithSorting() {
		fail("Not yet implemented");
	}

}
