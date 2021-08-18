package com.desafio.concrete.client;

import com.desafio.concrete.dto.CategoryResponse;
import com.desafio.concrete.dto.SubcategoriesL3;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url ="https://cs-hsa-api-categories-rest.herokuapp.com", name = "CATEGORIA-CLIENT")
public interface CategoriaClient {
    @GetMapping("/categories")
    CategoryResponse getCategory();

}
