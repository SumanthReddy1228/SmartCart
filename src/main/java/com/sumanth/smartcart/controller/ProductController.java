package com.sumanth.smartcart.controller;

import com.sumanth.smartcart.dto.ProductDto;
import com.sumanth.smartcart.service.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductController {

   private final IProductService iProductService;
   public  ProductController(IProductService iProductService){
       this.iProductService=iProductService;
   }

    @GetMapping("/products")
    public List<ProductDto> getProducts(){
        return iProductService.getProducts();
    }
}
