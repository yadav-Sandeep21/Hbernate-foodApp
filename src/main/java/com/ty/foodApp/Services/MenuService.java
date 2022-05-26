package com.ty.foodApp.Services;

import java.util.List;

import com.ty.foodApp.DAO.MenuDao;
import com.ty.foodApp.DTO.Menu;

public class MenuService {
	// Save Menu
	public Menu saveMenu(Menu menu) {
		MenuDao menuDao = new MenuDao();
		return menuDao.saveMenu(menu);
	}

	// Get by menu
	public Menu getMenuById(int id) {
		MenuDao menuDao = new MenuDao();
		return menuDao.getMenuById(id);
	}
	
	//Delete by id
	public boolean removeOrder(int id) {
		MenuDao menuDao = new MenuDao();
		return menuDao.removeOrder(id);
	}
	
	//Get all menus
	public List<Menu> getAllMenu(){
		MenuDao menuDao = new MenuDao();
		return menuDao.getAllMenu();
	}
}
