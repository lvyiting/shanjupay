package com.shanjupay.merchant.controller;

import com.shanjupay.merchant.api.MerchantService;
import com.shanjupay.merchant.api.dto.MerchantDTO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantController {

    @Reference
    private MerchantService merchantService;


    @GetMapping("/test/{id}")
    public MerchantDTO test(@PathVariable Long id){
        MerchantDTO dto = merchantService.queryMerchantById(id);
        return dto;
    }




}
