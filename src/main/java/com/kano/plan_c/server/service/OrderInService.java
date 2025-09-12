package com.kano.plan_c.server.service;

import com.kano.plan_c.server.entity.OrderInInfo;
import com.kano.plan_c.server.mapper.OrderInMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: kano33
 * @Create: 2025-09-09 14:38
 **/


@Service
public class OrderInService {


    @Resource
    private OrderInMapper mapper;


    public List<OrderInInfo> queryIn(String itemCode) {
        return mapper.queryIn(itemCode);
    }


}
