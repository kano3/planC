package com.kano.plan_c.server.entity;

import com.kano.plan_c.server.enums.CmdInState;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @Author: kano33
 * @Create: 2025-09-09 14:41
 **/
@Schema(description = "验收上架之后回传sap,回传成功之后记账")
public record OrderInInfo(

        @Schema(description = "业务单号")
        String businessCode,

        @Schema(description = "客户编码")
        String customerCode,

        @Schema(description = "客户名称")
        String customerName,

        @Schema(description = "商品编码")
        String itemCode,

        @Schema(description = "商品名称")
        String itemName,

        @Schema(description = "数量")
        String qty,

        @Schema(description = "收货数量")
        String orderQty,

        @Schema(description = "收货人")
        String orderName,

        @Schema(description = "批号")
        String lot01,

        @Schema(description = "货位")
        String locCode,

//        @Schema(description = "状态")
//        CmdInState cmdState,

        @Schema(description = "状态")
        String cmdStateName,

        @Schema(description = "验收人")
        String qualityName,

        @Schema(description = "上架人")
        String putName,

        @Schema(description = "回传SAP状态, Y为成功, E为失败, F为待回传")
        String beactive,

        @Schema(description = "回传SAP错误信息")
        String msgtx
) {
}
