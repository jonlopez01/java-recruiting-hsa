package com.desafio.concrete.dto;

import java.util.List;

public class SubcategoriesL2 {
    private String id;
    private String name;
    private int relevance;
    private List<SubcategoriesL3> subcategories;
    private String iconImageUrl;
    public SubcategoriesL2() {
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

    public int getRelevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    public List<SubcategoriesL3> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<SubcategoriesL3> subcategories) {
        this.subcategories = subcategories;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public void setIconImageUrl(String iconImageUrl) {
        this.iconImageUrl = iconImageUrl;
    }
}

