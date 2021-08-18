package com.desafio.concrete.services;

import com.desafio.concrete.client.CuponClient;
import com.desafio.concrete.dto.CuponResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CuponServices {
    @Autowired
    private CuponClient cuponClient;

    public List<CuponResponse> allCupons(){
        return cuponClient.getCupons().stream().
                filter(cuponResponse -> cuponResponse.getExpiresAt().isAfter(LocalDate.now()))
                .collect(Collectors.toList());
    }
}
