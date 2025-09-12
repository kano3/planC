package com.kano.plan_c.controller;

import com.kano.plan_c.server.entity.OrderInInfo;
import com.kano.plan_c.server.service.OrderInService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: kano33
 * @Create: 2025-09-04 11:24
 **/

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private OrderInService service;

    @GetMapping("niHao")
    public List<OrderInInfo> niHao() {
        return service.queryIn("611181");
    }

}
