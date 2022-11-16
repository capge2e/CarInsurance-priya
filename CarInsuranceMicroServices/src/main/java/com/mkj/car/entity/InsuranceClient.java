package com.mkj.car.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InsuranceClient {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clientId;  // should be same as Aruna class structure 
	private String clientName;
	
	public InsuranceClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsuranceClient(int clientId, String clientName) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Override
	public String toString() {
		return "InsuranceClient [clientId=" + clientId + ", clientName=" + clientName + "]";
	}
	
	
	

}
