package com.leichu.grpc.demo.client.controller;

import com.leichu.grpc.demo.client.help.HelloReply;
import com.leichu.grpc.demo.client.help.HelloRequest;
import com.leichu.grpc.demo.client.help.SayHelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GrpcClient("sayHello")
	private SayHelloServiceGrpc.SayHelloServiceBlockingStub sayHelloService;

	@GetMapping("say")
	public String say(String name) {
		HelloRequest request = HelloRequest.newBuilder().setName(name).build();
		HelloReply helloReply = sayHelloService.sayHello(request);
		return helloReply.getMessage();
	}


}
