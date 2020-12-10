package com.self.starter.autoconfig;

public class HelloService {
	
	HelloProperties helloProperties;

	public String sayHelloAtguigu(String name) {
		return helloProperties.getPrefix() + "-" + name + "-" + helloProperties.getSuffix();
	}

	public HelloProperties getHelloProperties() {
		return helloProperties;
	}

	public void setHelloProperties(HelloProperties helloProperties) {
		this.helloProperties = helloProperties;
	}
}
