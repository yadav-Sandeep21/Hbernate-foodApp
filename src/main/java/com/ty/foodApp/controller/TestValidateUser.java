package com.ty.foodApp.controller;

import com.ty.foodApp.Services.UserServices;

public class TestValidateUser {

	public static void main(String[] args) {
		UserServices userServices=new UserServices();
		userServices.validateUserById("Shuchi", "shuchi@gmail.com");
	}

}
