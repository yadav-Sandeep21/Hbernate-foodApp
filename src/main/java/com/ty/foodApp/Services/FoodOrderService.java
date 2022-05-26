package com.ty.foodApp.Services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.foodApp.DAO.FoodOrderDao;
import com.ty.foodApp.DTO.FoodOrder;
import com.ty.foodApp.DTO.Item;

public class FoodOrderService {

	public FoodOrder saveOrder(FoodOrder foodOrder) {
		FoodOrderDao foodOrderDao = new FoodOrderDao();
		return foodOrderDao.saveOrder(foodOrder);
	}

	public FoodOrder getOrderById(int id) {
		FoodOrderDao dao = new FoodOrderDao();
		return dao.getOrderById(id);
	}

	public boolean removeOrder(int id) {
		FoodOrderDao dao = new FoodOrderDao();
		return dao.removeOrder(id);
	}
	public List<Item> getAllItem(){
		FoodOrderDao dao = new FoodOrderDao();
		return dao.getAllItem();
	}
	//Get Total Cost
	public void getTotal(List<Item> items) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		FoodOrderDao foodOrderDao=new FoodOrderDao();
		double d=foodOrderDao.getTotal(items);
		
		FoodOrder foodOrder=entityManager.find(FoodOrder.class, 2);
		foodOrder.setTotalCost(d);
		
		entityTransaction.begin();
		entityManager.merge(foodOrder);
		entityTransaction.commit();
	}
}
