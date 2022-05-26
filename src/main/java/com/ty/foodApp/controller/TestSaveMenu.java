package com.ty.foodApp.controller;

import com.ty.foodApp.DTO.Menu;
import com.ty.foodApp.Services.MenuService;

public class TestSaveMenu {
	public static void main(String[] args) {
		MenuService menuService=new MenuService();
		Menu menu=new Menu();
		menu.setName("Chicken Fried Rice");
		menu.setDescription("This is very nice resturent for Non-vegaterian food!");
		menu.setCost(200);
		menu.setType("Veg & Non-Veg Type");
		menu.setOffer("50% Off, If u are taking two birayani.");
		menu.setImage("https://www.google.com/search?q=food+image&rlz=1C1JZmgrc=ZWBOrig6ZdlnLM");
		menuService.saveMenu(menu);
	}
}
