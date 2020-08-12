package top.yfly.nacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class SendController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${servive-url.nacos-user-service}")
    private String serverUrl;

    @RequestMapping("get/{id}")
    private String getOrder(@PathVariable long id) {
    	System.out.println("url:" + serverUrl);
        return restTemplate.getForObject(serverUrl + "/config/get/" + id, String.class);
    }
}
