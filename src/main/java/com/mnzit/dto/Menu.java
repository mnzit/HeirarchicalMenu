package com.mnzit.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class Menu {
    private Long id;
    private String name;
    private Long parentId;
    private List<Menu> childrens = new ArrayList<>();

    public Menu(Long id) {
        this.id = id;
    }

    public Menu(Long id, String name, Long parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public Menu(Long id, String name, Long parentId, List<Menu> childrens) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.childrens = childrens;
    }

    public void addChildren(Menu menu){
        childrens.add(menu);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public List<Menu> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Menu> childrens) {
        this.childrens = childrens;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", childrens=" + childrens +
                '}';
    }
}
