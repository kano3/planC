package com.kano.plan_c.mcp.tool;

import com.kano.plan_c.server.entity.InvLocInfo;
import jakarta.annotation.Resource;
import com.kano.plan_c.server.service.InvLocService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: kano33
 * @Create: 2025-09-04 09:54
 **/

@Service
public class ItemTools {

    @Resource
    private InvLocService invLocService;

    @Tool(name = "ItemTools", description = "查询商品库存")
    public List<InvLocInfo> queryInventory(String sku) {
        // 这里用模拟数据，实际场景可以查数据库 / 调用ERP接口

        return invLocService.queryInvLocInfo(sku);
    }
}
