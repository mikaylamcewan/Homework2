package com.example.a3634homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuData {
    public static double totalPrice;

    public static MenuItem getMenuItemByID(int menuItemID) {
        return menuItems.get(menuItemID);
    }

    public static ArrayList<MenuItem> getAllMenuItems() {
        return new ArrayList<MenuItem>((List) Arrays.asList(menuItems.values().toArray()));
    }

    //menuItems
    private static final HashMap<Integer, MenuItem> menuItems = new HashMap<>();

    //selected MenuItems
    public static HashMap<MenuItem, Integer> orderedItems = new HashMap<>();

    static {
        menuItems.put(1, new MenuItem(
                1,
                "Grilled Chicken Burger",
                "Served on a fresh milk bun with hand cut lettuce, fresh tomatoes, cheese, onion and whole egg mayonnaise.",
                "$12.20",
                R.drawable.item1
        ));

        menuItems.put(2, new MenuItem(
                2,
                "Chicken & Chilli Burger",
                "Served on a fresh milk bun with hand cut lettuce, fresh tomatoes, onion and whole egg mayonnaise.",
                "$12.20",
                R.drawable.item2
        ));

        menuItems.put(3, new MenuItem(
                3,
                "Beef Burger",
                "Grass fed angus beef served on a fresh milk bun with hand cut lettuce, fresh tomatoes, onion, and special sauce.",
                "$13.50",
                R.drawable.item3
        ));

        menuItems.put(4, new MenuItem(
                4,
                "Double Chicken Burger",
                "Served on a fresh milk bun with hand cut lettuce, fresh tomatoes, cheese, onion and whole egg mayonnaise.",
                "$15.00",
                R.drawable.item4
        ));
        menuItems.put(5, new MenuItem(
                5,
                "Double Decker Beef Burger",
                "Served on a fresh milk bun with hand cut lettuce, fresh tomatoes, cheese, onion and secret sauce.",
                "$16.00",
                R.drawable.item5
        ));
        menuItems.put(6, new MenuItem(
                6,
                "Borger Kong Chomper",
                "Bacon, pineapple and cheese. Served on a fresh milk bun with hand cut lettuce, fresh tomatoes, cheese, onion and secret sauce.",
                "$15.50",
                R.drawable.item6
        ));
        menuItems.put(7, new MenuItem(
                7,
                "Schniztel Burger",
                "Served on a fresh milk bun with hand cut lettuce, fresh tomatoes, onion and whole egg mayonnaise.",
                "$14.00",
                R.drawable.item7
        ));
        menuItems.put(8, new MenuItem(
                8,
                "Hot Chips",
                "A side of Hot Chips.",
                "$4.00",
                R.drawable.item8
        ));
        menuItems.put(9, new MenuItem(
                9,
                "Sweet Potato Chips",
                "A side of Sweet Potato Chips.",
                "$6.00",
                R.drawable.item9
        ));
        menuItems.put(10, new MenuItem(
                10,
                "Spiced Devil Wings",
                "6x Hot and Spicy Devil Wings with Blue Cheese Sauce.",
                "$9.00",
                R.drawable.item10
        ));
        menuItems.put(11, new MenuItem(
                11,
                "BBQ Drumsticks",
                "3x Marinated BBQ Drumsticks.",
                "$10.00",
                R.drawable.item11
        ));
        menuItems.put(12, new MenuItem(
                12,
                "Cream potato",
                "Cream potato.",
                "$7.50",
                R.drawable.item12
        ));
        menuItems.put(13, new MenuItem(
                13,
                "Greek Salad",
                "Traditional vegetables with feta cheese. ",
                "$8.00",
                R.drawable.item13
        ));
        menuItems.put(14, new MenuItem(
                14,
                "Caesar Salad",
                "Crispy bacon, chicken, egg and parmesan with dressing",
                "$8.50",
                R.drawable.item14
        ));
        menuItems.put(15, new MenuItem(
                15,
                "Garden Salad",
                "Chicken Burger",
                "$7.00",
                R.drawable.item15
        ));


    }

}
