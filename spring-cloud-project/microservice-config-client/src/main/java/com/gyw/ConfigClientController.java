package com.gyw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//手动刷新配置
public class ConfigClientController {
    @Value("${spring.cloud.config.profile}")
    private String profile;

    @GetMapping("/profile")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(this.profile);
    }
}
