package com.demo.management;

import com.demo.management.mcp.McpController;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);

	}

	@Bean
	public List<ToolCallback> managementTools(McpController mcpController) {
		return List.of(ToolCallbacks.from(mcpController));
	}

}
