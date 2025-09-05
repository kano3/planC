package com.kano.plan_c.server.entity;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

/**
 * @Author: kano33
 * @Create: 2025-09-04 11:41
 **/

public record InvLocInfo(
        @Schema(description = "商品编码")
        String itemCode,

        @Schema(description = "商品名称")
        String itemName,

        @Schema(description = "商品批号")
        String lot01,

        @Schema(description = "货位编码")
        String locCode,

        @Schema(description = "数量")
        BigDecimal qty,

        @Schema(description = "入库预占")
        BigDecimal qtyIn,

        @Schema(description = "出库预占")
        BigDecimal qtyOut,

        @Schema(description = "补入预占")
        BigDecimal qtyRepIn,

        @Schema(description = "补出预占")
        BigDecimal qtyRepOut,

        @Schema(description = "锁定数量")
        BigDecimal qtyLock,

        @Schema(description = "货位是否锁定")
        Integer isLock,

        @Schema(description = "所属仓库")
        Long whId) {
}
