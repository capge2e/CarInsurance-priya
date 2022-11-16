package com.mkj.car.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class CarInsurance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String insuranceName;
	private int premium;
	private int sumInsured;
	private String isCoveredAccident;
	private int maxAccidentAmount;
	private String isCarTheftCovered;
	private int carTheft;

	public CarInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarInsurance(int cId, String insuranceName, int premium, int sumInsured, String isCoveredAccident,
			int maxAccidentAmount, String isCarTheftCovered, int carTheft) {
		super();
		this.cId = cId;
		this.insuranceName = insuranceName;
		this.premium = premium;
		this.sumInsured = sumInsured;
		this.isCoveredAccident = isCoveredAccident;
		this.maxAccidentAmount = maxAccidentAmount;
		this.isCarTheftCovered = isCarTheftCovered;
		this.carTheft = carTheft;

	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	public int getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}

	public int getMaxaccidentAmount() {
		return maxAccidentAmount;
	}

	public void setMaxaccidentAmount(int maxaccidentAmount) {
		this.maxAccidentAmount = maxaccidentAmount;
	}

	public String getIsCoveredAccident() {
		return isCoveredAccident;
	}

	public void setIsCoveredAccident(String isCoveredAccident) {
		this.isCoveredAccident = isCoveredAccident;
	}

	public String getIsCarTheftCovered() {
		return isCarTheftCovered;
	}

	public void setIsCarTheftCovered(String isCarTheftCovered) {
		this.isCarTheftCovered = isCarTheftCovered;
	}

	public int getCarTheft() {
		return carTheft;
	}

	public void setCarTheft(int carTheft) {
		this.carTheft = carTheft;
	}

	@Override
	public String toString() {
		return "CarInsurance [cId=" + cId + ", insuranceName=" + insuranceName + ", premium=" + premium
				+ ", sumInsured=" + sumInsured + ", isCoveredAccident=" + isCoveredAccident + ", maxAccidentAmount="
				+ maxAccidentAmount + ", isCarTheftCovered=" + isCarTheftCovered + ", carTheft=" + carTheft + "]";
	}

}
