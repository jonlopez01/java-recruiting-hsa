package com.desafio.concrete.model;

import com.desafio.concrete.dto.SubcategoriesL4;

import java.util.List;

public class SubcategoryModel {
    private String id;
    private String name;
    private String smallImageUrl;
    private List<SubcategoryModelL2> subcategories;

    public SubcategoryModel() {
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

    public List<SubcategoryModelL2> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<SubcategoryModelL2> subcategories) {
        this.subcategories = subcategories;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }
}
