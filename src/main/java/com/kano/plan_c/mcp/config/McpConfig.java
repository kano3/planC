package com.kano.plan_c.mcp.config;

import com.kano.plan_c.mcp.tool.ItemTools;
import com.kano.plan_c.mcp.tool.LocTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kano33
 * @Create: 2025-09-04 10:05
 **/

@Configuration
public class McpConfig {

    @Bean
    public ToolCallbackProvider itemToolProvider(ItemTools tools) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(tools)
                .build();
    }

    @Bean
    public ToolCallbackProvider LocToolProvider(LocTools tools) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(tools)
                .build();
    }


}
