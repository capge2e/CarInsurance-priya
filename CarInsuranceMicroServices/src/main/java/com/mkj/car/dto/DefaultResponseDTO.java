package com.mkj.car.dto;

import org.springframework.stereotype.Component;

@Component
public class DefaultResponseDTO {
	
	private int  cId;
	private String insuranceName;
	private String clientName;
	private String remarks;
	
	
	
	public DefaultResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DefaultResponseDTO(String insuranceName, int cId, String clientName, String remarks) {
		super();
		this.insuranceName = insuranceName;
		this.cId = cId;
		this.clientName = clientName;
		this.remarks = remarks;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "DefaultResponseDTO [insuranceName=" + insuranceName + ", cId=" + cId + ", clientName=" + clientName
				+ ", remarks=" + remarks + "]";
	}
	


}
