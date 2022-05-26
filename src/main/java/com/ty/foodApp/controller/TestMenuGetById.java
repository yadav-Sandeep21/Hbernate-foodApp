package com.ty.foodApp.controller;

import com.ty.foodApp.Services.MenuService;

public class TestMenuGetById {

	public static void main(String[] args) {
		MenuService menuService=new MenuService();
		menuService.getMenuById(1);
		
	}

}
