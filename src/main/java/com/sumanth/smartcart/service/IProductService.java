package com.sumanth.smartcart.service;

import com.sumanth.smartcart.dto.ProductDto;

import java.util.List;

public interface IProductService {
    List<ProductDto> getProducts();
}
