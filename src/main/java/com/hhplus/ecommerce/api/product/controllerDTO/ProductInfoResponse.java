package com.hhplus.ecommerce.api.product.controllerDTO;


import com.hhplus.ecommerce.business.product.service.serviceDTO.ProductDTO;
import lombok.Builder;

@Builder
public class ProductInfoResponse {
    private String code;
    private String message;
    private ProductDTO body;
}