package com.ty.foodApp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.foodApp.DTO.FoodOrder;
import com.ty.foodApp.DTO.Item;
import com.ty.foodApp.DTO.Menu;
import com.ty.foodApp.Services.FoodOrderService;

public class TestSaveFoodApp {

	public static void main(String[] args) {
		
		FoodOrderService foodOrderService=new FoodOrderService();
		Menu menu=new Menu();
		FoodOrder foodOrder=new FoodOrder();
		foodOrder.setName("Ras");
		foodOrder.setPhone(7296304883l);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Menu menu1=entityManager.find(Menu.class, 1);
		Item item1=new Item();
		item1.setName(menu1.getName());
		item1.setQuantity(3);
		item1.setCost(menu1.getCost());
		
		Menu menu2=entityManager.find(Menu.class, 3);
		Item item2=new Item();
		item2.setName(menu2.getName());
		item2.setQuantity(2);
		item2.setCost(menu2.getCost());
		
		Menu menu3=entityManager.find(Menu.class, 4);
		Item item3=new Item();
		item3.setName(menu3.getName());
		item3.setQuantity(1);
		item3.setCost(menu3.getCost());
		
		List<Item> items=new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		foodOrder.setItem(items);
		item1.setFoodOrder(foodOrder);
		item2.setFoodOrder(foodOrder);
		item3.setFoodOrder(foodOrder);
		
		foodOrderService.saveOrder(foodOrder);
		
		foodOrderService.getTotal(items);

	}

}
