package com.sumanth.smartcart.service.impl;

import com.sumanth.smartcart.dto.ProductDto;
import com.sumanth.smartcart.entity.Product;
import com.sumanth.smartcart.repository.ProductRepository;
import com.sumanth.smartcart.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService {

    private  final ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> getProducts() {
        return productRepository.findAll().stream().map(this::transformToDto).collect(Collectors.toList());
    }

    private ProductDto transformToDto(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }
}
