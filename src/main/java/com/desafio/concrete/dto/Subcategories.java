package com.desafio.concrete.dto;

import java.util.List;

public class Subcategories {
    private String id;
    private String name;
    private List<SubcategoriesL2> subcategories;


    public Subcategories() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubcategoriesL2> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<SubcategoriesL2> subcategories) {
        this.subcategories = subcategories;
    }

}
