package com.kano.plan_c.controller;

import com.kano.plan_c.server.entity.InvLocInfo;
import com.kano.plan_c.server.service.InvLocService;
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
    private InvLocService service;

    @GetMapping("niHao")
    public List<InvLocInfo> niHao() {
        return service.queryInvLocInfo("216561");
    }

}
