package com.ty.foodApp.controller;

import com.ty.foodApp.Services.UserServices;

public class TestDeleteUserById {

	public static void main(String[] args) {
		UserServices userservices=new UserServices();
		userservices.deleteUserById(1);
	}

}
