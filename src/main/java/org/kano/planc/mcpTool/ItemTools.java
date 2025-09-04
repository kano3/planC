package org.kano.planc.mcpTool;

import org.springframework.ai.tool.annotation.Tool;

import java.util.Map;

/**
 * @Author: kano33
 * @Create: 2025-09-04 09:54
 **/

public class ItemTools {

    @Tool(description = "查询商品库存")
        public Map<String, Object> queryInventory(String sku) {
        // 这里用模拟数据，实际场景可以查数据库 / 调用ERP接口
        int stock;
        String name;

        switch (sku) {
            case "A1001" -> {
                name = "iPhone 15";
                stock = 50;
            }
            case "B2002" -> {
                name = "MacBook Pro 14";
                stock = 12;
            }
            default -> {
                name = "未知商品";
                stock = 0;
            }
        }

        return Map.of(
                "sku", sku,
                "name", name,
                "stock", stock
        );
    }
}
