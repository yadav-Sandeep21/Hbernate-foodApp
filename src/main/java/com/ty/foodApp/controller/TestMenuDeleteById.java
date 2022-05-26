package com.ty.foodApp.controller;

import com.ty.foodApp.Services.MenuService;

public class TestMenuDeleteById {

	public static void main(String[] args) {
		MenuService menuService=new MenuService();
		menuService.removeOrder(2);
	}

}
