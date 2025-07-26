# MCP-management-demo

This project is a demo for the Model Context Protocol (MCP). MCP enables seamless integration between AI models and tools by providing a standardized way to connect to various data sources and services.

This demo uses Spring Boot for guest and room management, persisting data in a PostgreSQL database via Spring Data JPA.

Guest and room operations are exposed as MCP tool calls, allowing LLMs or other MCP-compatible clients to interact with the application through standardized actions
