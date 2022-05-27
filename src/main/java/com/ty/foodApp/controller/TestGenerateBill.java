package com.ty.foodApp.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.foodApp.DAO.FoodOrderDao;
import com.ty.foodApp.DTO.Bill;
import com.ty.foodApp.DTO.Item;
import com.ty.foodApp.Services.FoodOrderService;

public class TestGenerateBill {

	public static void main(String[] args) {
		FoodOrderService foodOrderService = new FoodOrderService();

		FoodOrderDao foodOrderDao = new FoodOrderDao();
		List<Bill> bills = new ArrayList();
		List<Item> items = new ArrayList();

		for (Item item : foodOrderDao.getOrderById(1).getItem()) {
			Bill bill = new Bill();
			bill.setItem(item.getName());
			bill.setCost(item.getCost());
			bill.setQuantity(item.getQuantity());
			bill.setTotal(item.getCost() * item.getQuantity());
			bills.add(bill);
		}

		double total = 0;
		for (Bill bill : bills) {
			System.out.println(bill);
			total += bill.getTotal();
		}
		System.out.println("Total amount for the order " + total);
		System.out.println("Offer applied for 10% off of purchase over 1000");
		double b = foodOrderService.generateBill(1);
		System.out.println(b);
	}
}
