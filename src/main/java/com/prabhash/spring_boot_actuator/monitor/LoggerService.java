package com.prabhash.spring_boot_actuator.monitor;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements HealthIndicator {

    private final String LOGGER_SERVICE="Logger Service";

    @Override
    public Health health() {
        if (isGoodLoggerHealth()){
            return Health.up().withDetail(LOGGER_SERVICE, "Logger is up").build();
        } else {
            return Health.down().withDetail(LOGGER_SERVICE, "Logger is down").build();
        }
    }

    private boolean isGoodLoggerHealth() {
        // Logic to check database connection
        return false;
    }
}
