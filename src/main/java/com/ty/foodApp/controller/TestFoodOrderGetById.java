package com.ty.foodApp.controller;

import com.ty.foodApp.Services.FoodOrderService;

public class TestFoodOrderGetById {

	public static void main(String[] args) {
		FoodOrderService foodOrderService=new FoodOrderService();
		foodOrderService.getOrderById(1);
	}

}
