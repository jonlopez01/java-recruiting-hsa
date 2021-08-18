package com.desafio.concrete.controller;

import com.desafio.concrete.model.CategoryModel;
import com.desafio.concrete.services.CategoryService;
import com.desafio.concrete.services.CategoryServiceI;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("category/v1/")
public class CategoryController {

    @Autowired
    CategoryServiceI categoryService;
    //CategoryService categoryService;

    @ApiOperation(value = "CategoriesTop5", notes="retorna las categorias dentro de top 5",nickname = "Categorias")
    @GetMapping("categoriesTop")
    public ResponseEntity<Object> categoryTop(){
        try{
            List<CategoryModel> listCategoryModel = categoryService.topFive();
            return new ResponseEntity<>(listCategoryModel, HttpStatus.ACCEPTED);
            //return categoryService.topFive();
        }catch (Exception e){
            return new ResponseEntity<>("No se pudieron cargar las categorias Top, favor intenta mas tarde",HttpStatus.BAD_REQUEST);
        }
    }
    @ApiOperation(value = "Categorias", notes="retorna las categorias restantes al top 5",nickname = "Categorias")
    @GetMapping("categories")
    public List<CategoryModel> categoryRest(){
        return categoryService.categoryRest();
    }
}
