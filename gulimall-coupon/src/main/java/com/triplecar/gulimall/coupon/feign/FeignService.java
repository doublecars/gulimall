package com.triplecar.gulimall.coupon.feign;

import com.triplecar.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-product")
public interface FeignService {

    @RequestMapping("/product/brand/list")
    R test();
}
