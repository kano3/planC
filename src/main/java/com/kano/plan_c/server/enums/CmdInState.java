package com.kano.plan_c.server.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "入库指令状态")
public enum CmdInState {

    @Schema(description = "入库-收货") CMD_CREATE(10, "CREATED"),
    @Schema(description = "入库-验收")           CMD_CHECK(20, "CHECK"),
    @Schema(description = "入库-确认")           CMD_CONFIRM(60, "CONFIRM"),
    @Schema(description = "入库-PDA复核")       PDA_REVIEW(70, "REVIEW"),
    @Schema(description = "入库-索取")        CMD_DEMAND(50, "DEMAND"),
    @Schema(description = "作业完成/终止")       CMD_END(1000, "END");


    @EnumValue
    private final int code;

    private final String name;

    CmdInState(int code, String name){ this.code=code; this.name=name; }

    @JsonValue
    public int code(){ return code; } // 序列化输出 code（10/20/…）
    public String statusName(){ return name; }

    public static CmdInState fromCode(int code){
        for (var s: values()) if (s.code==code) return s;
        throw new IllegalArgumentException("unknown status: " + code);
    }

}

