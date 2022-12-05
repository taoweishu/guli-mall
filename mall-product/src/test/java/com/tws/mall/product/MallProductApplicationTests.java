package com.tws.mall.product;

import com.tws.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class MallProductApplicationTests {

    @Resource
    BrandService brandService;
    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        Map<String, Object> params = new HashMap<>();
        params.put("curPage", "1");
        params.put("limit", "10");
        brandService.queryPage(params);
    }
}
