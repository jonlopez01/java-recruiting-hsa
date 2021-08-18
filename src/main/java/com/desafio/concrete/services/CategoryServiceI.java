package com.desafio.concrete.services;

import com.desafio.concrete.model.CategoryModel;

import java.util.List;

public interface CategoryServiceI {
    List<CategoryModel> topFive();
    List<CategoryModel> categoryRest();
}
