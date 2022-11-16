package com.mkj.car.exception;

public class AllExceptionDTO {
	
	private String msg;
	private String adminInput;
	private String dateAndTime;
	public AllExceptionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllExceptionDTO(String msg, String adminInput, String dateAndTime) {
		super();
		this.msg = msg;
		this.adminInput = adminInput;
		this.dateAndTime = dateAndTime;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getAdminInput() {
		return adminInput;
	}
	public void setAdminInput(String adminInput) {
		this.adminInput = adminInput;
	}
	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	@Override
	public String toString() {
		return "AllExceptionDTO [msg=" + msg + ", adminInput=" + adminInput + ", dateAndTime=" + dateAndTime + "]";
	}
	
	

}
