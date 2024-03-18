package com.learning.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "platform-details")
public record PlatformDetailsConfig(String name, String address, long code) {
}
