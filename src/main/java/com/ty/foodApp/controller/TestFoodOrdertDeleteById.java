package com.ty.foodApp.controller;

import com.ty.foodApp.Services.FoodOrderService;

public class TestFoodOrdertDeleteById {

	public static void main(String[] args) {
		FoodOrderService service=new FoodOrderService();
		boolean res=service.removeOrder(1);
		System.out.println("-----------------------------");
		if(res)
		{
			System.out.println("Order deleted");
		}
		else
		{
			System.out.println("Order id doesnot exist");
		}
	}

}
