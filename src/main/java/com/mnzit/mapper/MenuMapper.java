package com.mnzit.mapper;

import com.mnzit.dto.Menu;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class MenuMapper {

    public static Menu mapToMenu(List<Menu> menuList) {

        Menu rootMenu = new Menu(0L, "ROOT", -1L);
        Map<Long, Menu> menuMap = menuList
                .stream()
                .collect(Collectors.toMap(Menu::getId, menu -> menu));

        for (Menu menu : menuList) {
            if (rootMenu.getId() == menu.getParentId()) {
                rootMenu.addChildren(menu);
            } else {
                Menu menuFound = menuMap.get(menu.getParentId());
                if (menuFound != null) {
                    menuFound.addChildren(menu);
                } else {
                    rootMenu.addChildren(menu);
                }
            }
        }

        return rootMenu;
    }
}
