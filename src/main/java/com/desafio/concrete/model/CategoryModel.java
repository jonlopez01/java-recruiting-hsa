package com.desafio.concrete.model;

import com.desafio.concrete.dto.SubcategoriesL3;
import com.desafio.concrete.dto.SubcategoriesL4;

import java.util.List;

public class CategoryModel implements Comparable<CategoryModel>{
    private String id;
    private String name;
    private int relevance;
    private String iconImageUrl;
    private List<SubcategoryModel> subcategories;


    public CategoryModel() {
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

    public List<SubcategoryModel> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<SubcategoryModel> subcategories) {
        this.subcategories = subcategories;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public void setIconImageUrl(String iconImageUrl) {
        this.iconImageUrl = iconImageUrl;
    }

    @Override
    public int compareTo(CategoryModel o) {
        if(o.getRelevance() > relevance){
            return -1;
        }else if(o.getRelevance() > relevance){
            return 0;
        }else{
            return 1;
        }
    }
}
