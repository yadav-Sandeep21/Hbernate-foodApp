package com.ty.foodApp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.foodApp.DTO.FoodOrder;
import com.ty.foodApp.DTO.Item;

public class FoodOrderDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// saveOrder
	public FoodOrder saveOrder(FoodOrder foodOrder) {
		entityTransaction.begin();
		for (Item item : foodOrder.getItem()) {
			entityManager.persist(item);
		}
		entityManager.persist(foodOrder);
		entityTransaction.commit();

		return foodOrder;
	}

	// Get Order By Id
	public FoodOrder getOrderById(int id) {
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		if (foodOrder != null) {
			List<Item> list = foodOrder.getItem();
			System.out.println("------Order details-------");
			System.out.println("The user name :" + foodOrder.getName());
			System.out.println("The user phone :" + foodOrder.getPhone());
			for (Item item : list) {
				System.out.println("Item name :" + item.getName());
				System.out.println("Item quantity :" + item.getQuantity());
				System.out.println("Item cost :" + item.getCost());
			}
		} else {
			System.out.println("No order available");
		}
		return foodOrder;
	}

	// Remove By Id
	public boolean removeOrder(int id) {
		boolean flag = true;
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		entityTransaction.begin();
		if (foodOrder != null) {
			for (Item item : foodOrder.getItem()) {
				entityManager.remove(item);
			}
			entityManager.remove(foodOrder);
			entityTransaction.commit();
			return flag;
		} else {
			flag = false;
			return flag;
		}
	}

	// Get all Item
	public List<Item> getAllItem() {
		String sql = "SELECT f FROM FoodOrder f";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	//Get total cost
	public double getTotal(List<Item> items) {
		
		double total=0;
		
		for(Item item: items) {
		total=total+item.getCost()*item.getQuantity();
		}
		return total;
	}
}
