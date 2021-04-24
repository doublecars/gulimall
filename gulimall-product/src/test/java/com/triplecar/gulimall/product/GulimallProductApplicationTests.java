package com.triplecar.gulimall.product;

import com.triplecar.gulimall.product.entity.BrandEntity;
import com.triplecar.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity byId = brandService.getById(1);
        System.out.println(byId);
    }

}
