package com.kano.plan_c.mcp.tool;

import com.kano.plan_c.server.entity.OrderInInfo;
import com.kano.plan_c.server.service.OrderInService;
import jakarta.annotation.Resource;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: kano33
 * @Create: 2025-09-09 14:32
 **/

@Service
public class OrderInTools {


    @Resource
    private OrderInService service;

    @Tool(name = "qtyIn", description = "查询商品入库预占")
    public List<OrderInInfo> queryOrderIn(String sku) {
        // 这里用模拟数据，实际场景可以查数据库 / 调用ERP接口
        return service.queryIn(sku);
    }
}
