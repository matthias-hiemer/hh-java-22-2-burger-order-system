package service;

import model.Menu;

import java.util.HashMap;
import java.util.Map;

public class OrderSystem {

    private Map<Integer, Menu> menus = new HashMap<>();


    public Menu addMenu(Menu menu){
        menus.put(menu.getNumber() , menu);
        return menu;
    }

    public Menu placeOrder(Integer number){
        Menu foundMenu = menus.get(number);
        System.out.println("Folgendes Burger Menü wurde bestellt: ");
        System.out.println(foundMenu);

        return foundMenu;
    }

}
