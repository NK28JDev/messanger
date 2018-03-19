package com.fb.data;

import com.fb.model.FbModel;

public class FbData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String doValidate(FbModel fbModel) {
		String value;
		HibCon hcon = new HibCon();
		hcon.createConnection(); // establishing database connection
		hcon.read(fbModel); // reading username and password from database
		hcon.close();// closing the session factory and session
		String uName = fbModel.getuName(); // getting username and password from
											// login form
		String pWord = fbModel.getpWord();
		if (uName.equals(hcon.DbUser) && (pWord.equals(hcon.DbPass))) {
			value = "success";
			System.out.println("validation done successfully by FbData class and returning the value success");
		} else {
			value = "failed";
			System.out.println("validation done successfully by FbData class and returning the value failed");

		}
		return value;
	}

}
