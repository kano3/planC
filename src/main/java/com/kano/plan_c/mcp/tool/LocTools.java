package com.kano.plan_c.mcp.tool;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

/**
 * @Author: kano33
 * @Create: 2025-09-04 10:19
 **/

@Service
public class LocTools {

    @Tool(description = "测试")
    public String loc() {
        return "ok";
    }
}
