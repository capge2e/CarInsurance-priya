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

import com.mkj.car.entity.CarInsurance;
import com.mkj.car.repository.CarInsuranceRepository;

@SpringBootTest
class CarInsuranceServiceImplTest {
	
	  @Mock
	  CarInsuranceRepository carInsuranceRepository;
	  
	   @InjectMocks
	  CarInsuranceServiceImpl  carInsuranceService;
	  
	  

	@Test
	//@Disabled
	@DisplayName("Test - to verify the insert operation")
	void testAddCarInsurance() throws Exception{
		
		// given
        CarInsurance sampleInput = new CarInsurance(1, "damage party", 9000, 8000, "50000", 20000, "30000", 6000);
        CarInsurance expectedOutput = new CarInsurance(2, "third party", 7000, 6000, "40000", 15000, "20000", 5000);
                //Object obj = new Object();
                BDDMockito.given(carInsuranceService.addCarInsurance(sampleInput)).willReturn(expectedOutput);
                
                // when
                CarInsurance actualOutput = carInsuranceService.addCarInsurance(sampleInput);
                
                // verify
                assertEquals(expectedOutput, actualOutput);
            }
		
	

	@Test
	//@Disabled
	@DisplayName("Test to verify all user returend")
	void testGetAllCarInsurance() throws Exception{
		// given

				CarInsurance insurance1 = new CarInsurance(1, "oppositeparty", 50000, 9000, "80000", 6000, "400000",60000);
				CarInsurance insurance2 = new CarInsurance(2, "third party", 40000, 6000, "60000", 5000, "300000",40000);

				List<CarInsurance> sampleOutput = new ArrayList<>();
				sampleOutput.add(insurance1);
				sampleOutput.add(insurance2);

				BDDMockito.given(carInsuranceService.getAllCarInsurance()).willReturn(sampleOutput);

				// ----------------------------------------------------------------------

				// when :- readyto test the funcationality (service)
				List<CarInsurance> actualOutput = carInsuranceService.getAllCarInsurance();


				// then : verify the sampleOutput with actual output
				// assertThat(actualOutput).isNotNull();  // or
				assertNotNull(actualOutput);
				assertThat(actualOutput.size()).isGreaterThan(0);
				assertIterableEquals(sampleOutput, actualOutput);

			}


		
	

	@Test
	@Disabled
	void testGetCarInsuranceBySumInsured() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetCarInsuranceByInsuranceName() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetCarInsuranceByPremium() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testUpdateCarInsurance() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	
	void testDeleteInsuranceByCId()  {
		fail("Not yet implemented");
	} 


	

	@Test
	@Disabled
	void testFindCarInsuranceWithSorting() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testFilterByInsuranaceName() {
		fail("Not yet implemented");
	}

	@Test
	//@Disabled
	@DisplayName("Test to verify the method getCarInsurance by Id should return CarInsurance or not ")
	void testGetInsuranceById() throws Exception {
		 // give
        CarInsurance sampleOutput = new CarInsurance(1, "third party", 5000, 90000, "3000", 80000, "40000", 8000);
        
        sampleOutput.setcId(1);
        
        int sampleInput = 1;
        
        BDDMockito.given(carInsuranceService.getInsuranceById(sampleInput)).willReturn(sampleOutput);
        
        // when
        CarInsurance actualOutput = carInsuranceService.getInsuranceById(sampleInput);
        
        // verify
        assertEquals(sampleOutput,actualOutput);
        assertSame(sampleOutput.getcId(), actualOutput.getcId());
        assertThat(actualOutput.getcId()).isGreaterThan(0);
    }
		
	

	@Test
	@Disabled
	void testSortingBasedOnPremium() {
		fail("Not yet implemented");
	}

}
