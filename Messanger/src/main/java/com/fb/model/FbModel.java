package com.fb.model;

public class FbModel {
	//all required fields
	private String fName;
	private String lName;
	private String uName;
	private String pWord;
	private String state;
	
	//all setters and getters
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	@Override
	public String toString() {
		return "FbModel [fName=" + fName + ", lName=" + lName + ", uName=" + uName + ", pWord=" + pWord + ", state="
				+ state + "]";
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getpWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
