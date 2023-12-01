package com.prabhash.spring_boot_actuator.monitor;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthContributor;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements HealthIndicator {


    private final String DATABASE_SERVICE="Database Service";

    @Override
    public Health health() {
        if (isGoodDatabaseHealth()){
            return Health.up().withDetail(DATABASE_SERVICE, "Database is up").build();
        } else {
            return Health.down().withDetail(DATABASE_SERVICE, "Database is down").build();
        }
    }

    private boolean isGoodDatabaseHealth() {
        // Logic to check database connection
        return true;
    }

}
