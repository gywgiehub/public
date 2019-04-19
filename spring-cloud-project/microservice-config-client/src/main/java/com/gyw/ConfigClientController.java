package com.gyw;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//手动刷新配置
public class ConfigClientController {
    @Value("${active}")
    private String profile;

    @Value("${ip}")
    private String ip;

    @GetMapping("/profile")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(this.profile);
    }

    @GetMapping("/ip")
    public ResponseEntity<String> hello2() {
        return ResponseEntity.ok(this.ip);
    }

    public static void main(String[] args) {
        String str ="[{folder=1, jurisdiction=read, sameAsEmpId=, departmentId=1}, {folder=2, jurisdiction=write, sameAsEmpId=, departmentId=2}]";
        JSONArray jsonArray = new JSONArray();

    }
}
