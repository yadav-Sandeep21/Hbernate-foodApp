package com.ty.foodApp.controller;

import com.ty.foodApp.DTO.User;
import com.ty.foodApp.Services.UserServices;

public class SaveUserController {

	public static void main(String[] args) {
		UserServices userServices=new UserServices();
		
		User user=new User();
		user.setName("Shuchi");
		user.setEmail("shuchi@gmail.com");
		user.setPhone(234567);
		user.setPassword("shuchi");
		userServices.saveUser(user);
	}

}
