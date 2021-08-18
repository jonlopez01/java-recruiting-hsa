package com.desafio.concrete.services;

import com.desafio.concrete.client.CategoriaClient;
import com.desafio.concrete.dto.*;
import com.desafio.concrete.model.CategoryModel;
import com.desafio.concrete.model.SubcategoryModel;
import com.desafio.concrete.model.SubcategoryModelL2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class CategoryService implements CategoryServiceI{
    @Autowired
    CategoriaClient categoriaClient;

    public static List<CategoryModel> listCategory = new ArrayList<>();

    public List<CategoryModel> topFive(){
        CategoryResponse category = categoriaClient.getCategory();
        return convertCategoryDto(category.getSubcategories().get(0).getSubcategories(), true);
    }

    public List<CategoryModel> categoryRest(){
        CategoryResponse category = categoriaClient.getCategory();
        return convertCategoryDto(category.getSubcategories().get(0).getSubcategories(), false);
    }

    private static List<CategoryModel> convertCategoryDto(List<SubcategoriesL2> subcategoriesL2, boolean topOrNot){
        List<CategoryModel> listCategoryModel = new ArrayList<>();
        List<CategoryModel> listTopFive = new ArrayList<>();


        for (SubcategoriesL2 l2 : subcategoriesL2) {
            CategoryModel categoryModel = new CategoryModel();
            categoryModel.setId(l2.getId());
            categoryModel.setName(l2.getName());
            categoryModel.setRelevance(l2.getRelevance());
            categoryModel.setIconImageUrl(l2.getIconImageUrl());
            categoryModel.setSubcategories(dtoSubL2(l2.getSubcategories()));
            listCategoryModel.add(categoryModel);
        }

        Collections.sort(listCategoryModel);
        listTopFive = listCategoryModel.stream().limit(5).collect(Collectors.toList());

        if(!topOrNot){
            List<CategoryModel> ListRest = new ArrayList<>();
            for(int i = 0; i < listCategoryModel.size();i++){
                if(i >= 5){
                    ListRest.add(listCategoryModel.get(i));
                }
            }
            return ListRest;
        }else{
            return listTopFive;
        }

        //listCategoryModel.stream().map(categoryModel -> )
        //return listCategoryModel.stream().sorted((o1, o2) -> o1.getRelevance() > o2.getRelevance()).collect(Collectors.toList());
    }

    private static List<SubcategoryModel> dtoSubL2(List<SubcategoriesL3> subcategoriesL3){
        List<SubcategoryModel> listSubcategoryModel = new ArrayList<>();
        List<SubcategoryModel> listTopFive = new ArrayList<>();


        int contador= 0;

        for (SubcategoriesL3 subc : subcategoriesL3) {
            SubcategoryModel subcategoryModel = new SubcategoryModel();
            subcategoryModel.setId(subc.getId());
            subcategoryModel.setName(subc.getName());
            subcategoryModel.setSmallImageUrl(subc.getSmallImageUrl());
            subcategoryModel.setSubcategories(dtoSubL3(subc.getSubcategories()));
            listSubcategoryModel.add(subcategoryModel);
        }
        return listSubcategoryModel;

    }

    private static List<SubcategoryModelL2> dtoSubL3(List<SubcategoriesL4> subcategoriesL4){
        List<SubcategoryModelL2> listsubcategoryModelL2 = new ArrayList<>();

        for (SubcategoriesL4 subc : subcategoriesL4) {
            SubcategoryModelL2 subcategoryModelL2 = new SubcategoryModelL2();
            subcategoryModelL2.setId(subc.getId());
            subcategoryModelL2.setName(subc.getName());
            subcategoryModelL2.setRelevance(subc.getRelevance());
            listsubcategoryModelL2.add(subcategoryModelL2);
        }
        return listsubcategoryModelL2;


    }

}



