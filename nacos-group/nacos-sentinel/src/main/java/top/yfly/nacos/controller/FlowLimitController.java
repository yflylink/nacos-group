package top.yfly.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

@RestController
public class FlowLimitController {

	@GetMapping("/testa")
	@SentinelResource(value = "testa", blockHandler = "callbackA")
	public String testA() {
//		int age = 10/0;
		return "test -aa";
	}
	public String callbackA(BlockException exception) {
//		System.out.println(exception);
		return "这是一个异常";
	}
	
	@GetMapping("testb")
	public String testB() {
		return "test bb";
	}
}
