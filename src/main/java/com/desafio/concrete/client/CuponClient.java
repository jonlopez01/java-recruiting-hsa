package com.desafio.concrete.client;

import com.desafio.concrete.dto.CuponResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url ="https://cs-hsa-api-coupons-rest.herokuapp.com", name = "CUPON-CLIENT")
public interface CuponClient {
    @GetMapping("/coupons")
    List<CuponResponse> getCupons();

}
