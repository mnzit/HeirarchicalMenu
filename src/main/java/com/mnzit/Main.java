package com.mnzit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mnzit.dto.Menu;
import com.mnzit.mapper.MenuMapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Menu> menuList = new ArrayList();
        menuList.add(new Menu(10L, "VIEW", 8L));
        menuList.add(new Menu(25L, "VIEW_INNER", 13L));
        menuList.add(new Menu(14L, "CREATE", 3L));
        menuList.add(new Menu(15L, "MANAGE", 3L));
        menuList.add(new Menu(24L, "MANAGE", 7L));
        menuList.add(new Menu(1L, "MENU", 0L));
        menuList.add(new Menu(2L, "DASHBOARD", 1L));
        menuList.add(new Menu(3L, "CLIENT", 1L));
        menuList.add(new Menu(18L, "MANAGE", 5L));
        menuList.add(new Menu(19L, "VIEW", 6L));
        menuList.add(new Menu(26L, "VIEW_INNER", 25L));
        menuList.add(new Menu(20L, "CREATE", 6L));
        menuList.add(new Menu(8L, "CLIENT_PROFILE", 0L));
        menuList.add(new Menu(16L, "VIEW", 5L));
        menuList.add(new Menu(17L, "CREATE", 5L));
        menuList.add(new Menu(21L, "MANAGE", 6L));
        menuList.add(new Menu(22L, "VIEW", 7L));
        menuList.add(new Menu(23L, "CREATE", 7L));
        menuList.add(new Menu(4L, "SETTING", 0L));
        menuList.add(new Menu(5L, "SYSTEM", 4L));
        menuList.add(new Menu(6L, "USER_ROLE", 4L));
        menuList.add(new Menu(7L, "USER_PROFILE", 4L));
        menuList.add(new Menu(11L, "CREATE", 8L));
        menuList.add(new Menu(12L, "MANAGE", 8L));
        menuList.add(new Menu(13L, "VIEW", 3L));
//        menuList.add(new Menu(27L, "VIEW", 29L));


        Menu menu = MenuMapper.mapToMenu(menuList);

        try {
            ObjectMapper objectMapper = new ObjectMapper();

            String result = objectMapper.writeValueAsString(menu);

            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
