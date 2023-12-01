package com.prabhash.spring_boot_actuator.monitor;


import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "custom")
@Component
public class CustomerActuatorEndPoint {


    @ReadOperation
    public Map<String, String> customEndPoint(String userName) {
        Map<String, String> map = new HashMap<>();
        map.put("customkey1", "customvalue1");
        map.put("username",userName);
        return map;
    }


}
