package com.mkj.car.dto;

public class InsuranceResponseDTO implements MyDTO {

	private int insuranceId;
	private String insuranceName;
	
	public InsuranceResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsuranceResponseDTO(int insuranceId, String insuranceName) {
		super();
		this.insuranceId = insuranceId;
		this.insuranceName = insuranceName;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	@Override
	public String toString() {
		return "InsuranceResponseDTO [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + "]";
	}
	
	

}
