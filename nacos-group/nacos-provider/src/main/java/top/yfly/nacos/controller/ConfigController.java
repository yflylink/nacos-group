package top.yfly.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${server.port}")
    private int info;

    @RequestMapping("/get/{id}")
    public String get(@PathVariable long id) {
        return "prot:" + info + "id:" + id;
    }
}
