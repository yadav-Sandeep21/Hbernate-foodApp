package com.ty.foodApp.controller;

import java.util.List;

import com.ty.foodApp.DTO.Menu;
import com.ty.foodApp.Services.MenuService;

public class TestMenuGetAll {

	public static void main(String[] args) {
		MenuService menuService=new MenuService();
		List<Menu> menus=menuService.getAllMenu();
		for(Menu menu:menus) {
			System.out.println("Id is: "+menu.getId());
			System.out.println("Name is: "+menu.getName());
			System.out.println("Description is: "+menu.getDescription());
			System.out.println("Cost is: "+menu.getCost());
			System.out.println("Type is: "+menu.getType());
			System.out.println("Offer is: "+menu.getOffer());
			System.out.println("Image link is: "+menu.getImage());
		}
	}

}
