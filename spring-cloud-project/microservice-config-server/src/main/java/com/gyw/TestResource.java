package com.gyw;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class TestResource {

    @GetMapping("test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("测试");
    }
}
