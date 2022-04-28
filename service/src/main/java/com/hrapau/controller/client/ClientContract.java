package com.hrapau.controller.client;

import com.hrapau.configuration.FeingConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-client", configuration = FeingConfig.class)
public interface ClientContract {
    @GetMapping("/client-info")
    String getClientInfo();
}
