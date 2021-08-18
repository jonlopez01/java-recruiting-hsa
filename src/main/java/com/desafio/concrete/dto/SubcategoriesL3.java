package com.desafio.concrete.dto;

import java.util.List;

public class SubcategoriesL3 {
    private String id;
    private String name;
    private List<SubcategoriesL4> subcategories;
    private String largeImageUrl;
    private String mediumImageUrl;
    private String smallImageUrl;
    public SubcategoriesL3() {
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

    public List<SubcategoriesL4> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<SubcategoriesL4> subcategories) {
        this.subcategories = subcategories;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }
}
