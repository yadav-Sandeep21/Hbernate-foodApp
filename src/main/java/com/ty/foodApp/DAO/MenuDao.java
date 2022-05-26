package com.ty.foodApp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.foodApp.DTO.Menu;

public class MenuDao {

	// Save Menu
	public Menu saveMenu(Menu menu) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (menu != null) {
			entityTransaction.begin();
			entityManager.persist(menu);
			entityTransaction.commit();
			System.out.println("Menu Added!");
		}
		return menu;
	}

	// Get by menu
	public Menu getMenuById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Menu menu = entityManager.find(Menu.class, 2);

		if (menu != null) {
			System.out.println("Id is: " + menu.getId());
			System.out.println("Name of Menu: " + menu.getName());
			System.out.println("Description is: " + menu.getDescription());
			System.out.println("Cost of food is: " + menu.getCost());
			System.out.println("Type of food are: " + menu.getType());
			System.out.println("Offer is: " + menu.getOffer());
			System.out.println("image link is: " + menu.getImage());
		} else {
			System.out.println("No such item is available!");
		}
		return menu;
	}

	// Remove By Id
	public boolean removeOrder(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Menu menu=entityManager.find(Menu.class, id);
		
		if(menu!=null) {
			entityTransaction.begin();
			entityManager.remove(menu);
			entityTransaction.commit();
			System.out.println("User deleting id is!:"+id);
			return true;
		}
		else
		{
			System.out.println("No user found for delete!");
		}
		return false;
		
	}
	//Get all Menus
	public List<Menu> getAllMenu(){
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String sql="SELECT m FROM Menu m";
		Query query=entityManager.createQuery(sql);

		return query.getResultList();
	}
}
