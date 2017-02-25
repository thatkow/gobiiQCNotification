package com.diversityarrays.kdcompute.gobiiqc.containers;

import java.util.Arrays;

public class DTOHeaderAuth {
	String userName;
	String password;
	String token;
	String gobiiCropType;
	public DTOHeaderAuth(String userName, String password, String token, String gobiiCropType) {
		super();
		this.userName = userName;
		this.password = password;
		this.token = token;
		this.gobiiCropType = gobiiCropType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getGobiiCropType() {
		return gobiiCropType;
	}
	public void setGobiiCropType(String gobiiCropType) {
		this.gobiiCropType = gobiiCropType;
	}

	@Override
	public String toString() {
		return String.join(", ", Arrays.asList(
				"userName       ="+userName       ,
				"password       ="+password       ,
				"token          ="+token          ,
				"gobiiCropType  ="+gobiiCropType  
				));
	}
}
