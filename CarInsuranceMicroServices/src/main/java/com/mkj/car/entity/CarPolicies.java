package com.mkj.car.entity;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class CarPolicies {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cpolicyId;// car insurance is the seprate code
	private int carPolicyNo;

	// @OneToOne(cascade = CascadeType.ALL)
	// @JoinColumn(name = "InsuranceClient")
	// private InsuranceClient insuranceClient;

	@NotNull(message = "client Name cannot be Null")
	private String clientName; // have to shared from Aruna
	private String dateOfPurchase;
	private String dateOfExpire;
	private String isClaimed;
	private String claimDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "carInsurance")
	private CarInsurance carInsurance;

	public CarPolicies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarPolicies(int cpolicyId, int carPolicyNo,
			@NotNull(message = "client Name cannot be Null") String clientName, String dateOfPurchase,
			String dateOfExpire, String isClaimed, String claimDate) {
		super();
		this.cpolicyId = cpolicyId;
		this.carPolicyNo = carPolicyNo;
		this.clientName = clientName;
		this.dateOfPurchase = dateOfPurchase;
		this.dateOfExpire = dateOfExpire;
		this.isClaimed = isClaimed;
		this.claimDate = claimDate;
	}

	public int getCpolicyId() {
		return cpolicyId;
	}

	public void setCpolicyId(int cpolicyId) {
		this.cpolicyId = cpolicyId;
	}

	public int getCarPolicyNo() {
		return carPolicyNo;
	}

	public void setCarPolicyNo(int carPolicyNo) {
		this.carPolicyNo = carPolicyNo;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getDateOfExpire() {
		return dateOfExpire;
	}

	public void setDateOfExpire(String dateOfExpire) {
		this.dateOfExpire = dateOfExpire;
	}

	public String getIsClaimed() {
		return isClaimed;
	}

	public void setIsClaimed(String isClaimed) {
		this.isClaimed = isClaimed;
	}

	public String getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(String claimDate) {
		this.claimDate = claimDate;
	}

	public CarInsurance getCarInsurance() {
		return carInsurance;
	}

	public void setCarInsurances(CarInsurance carInsurance) {
		this.carInsurance = carInsurance;
	}

	@Override
	public String toString() {
		return "CarPolicies [cpolicyId=" + cpolicyId + ", carPolicyNo=" + carPolicyNo + ", clientName=" + clientName
				+ ", dateOfPurchase=" + dateOfPurchase + ", dateOfExpire=" + dateOfExpire + ", isClaimed=" + isClaimed
				+ ", claimDate=" + claimDate + ", carInsurance=" + carInsurance + "]";
	}

}
