package com.kano.plan_c.server.entity;

import java.math.BigDecimal;

/**
 * @Author: kano33
 * @Create: 2025-09-04 11:41
 **/

public record InvLocInfo(String itemCode,
                         String itemName,
                         String lot01,
                         String locCode,
                         BigDecimal qty,
                         BigDecimal qtyIn,
                         BigDecimal qtyOut,
                         BigDecimal qtyRepIn,
                         BigDecimal qtyRepOut,
                         BigDecimal qtyLock,
                         Integer isLock,
                         Long whId) {
}
