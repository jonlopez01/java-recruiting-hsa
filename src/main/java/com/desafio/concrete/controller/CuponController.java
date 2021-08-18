package com.desafio.concrete.controller;

import com.desafio.concrete.client.CategoriaClient;
import com.desafio.concrete.dto.CategoryResponse;
import com.desafio.concrete.dto.CuponResponse;
import com.desafio.concrete.dto.Subcategories;
import com.desafio.concrete.dto.SubcategoriesL3;
import com.desafio.concrete.model.CategoryModel;
import com.desafio.concrete.services.CategoryService;
import com.desafio.concrete.services.CuponServices;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("cupon/v1/")
public class CuponController {

    @Autowired
    private CuponServices cuponServices;



    @GetMapping("cupons")
    @ApiOperation(value = "Cupones", notes="retorna los cupones vigentes a la fecha actual",nickname = "cupons")
    public ResponseEntity<Object> cupons(){
        try {
            List<CuponResponse> cupons = cuponServices.allCupons();
            return new ResponseEntity<>(cupons, HttpStatus.ACCEPTED);
        }catch (Exception e){
                return new ResponseEntity<>("No se pudieron cargar los cupones, intenta mas tarde",HttpStatus.BAD_REQUEST);
        }

    }



}
