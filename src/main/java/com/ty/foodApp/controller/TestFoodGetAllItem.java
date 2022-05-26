package com.ty.foodApp.controller;

import java.util.List;

import com.ty.foodApp.DTO.Item;
import com.ty.foodApp.Services.FoodOrderService;

public class TestFoodGetAllItem {

	public static void main(String[] args) {
		FoodOrderService foodOrderService = new FoodOrderService();
		List<Item> items=foodOrderService.getAllItem();
		
		for(Item item : items) {
			System.out.println("Id is: "+item.getId());
			System.out.println("name is: "+item.getName());
			System.out.println("Phone no is: "+item.getCost());
		}
	}

}
