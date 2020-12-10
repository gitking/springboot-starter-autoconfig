package com.self.starter.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 如果想让这个自动配置类生效(被SpringBoot应用启动的时候就被加载),需要在classpath路径下添加META-INF/spring.factories
 * 并且把这个类配置进去
 * 可以参考spring-boot-autoconfigure-2.3.0.RELEASE.jar里面的配置
 * @author dell
 */
@Configuration
@ConditionalOnWebApplication//只在web应用下才生效
@EnableConfigurationProperties(HelloProperties.class)//让HelloProperties这个配置类生效
public class HelloServiceAutoConfiguration {
	
	@Autowired
	HelloProperties helloProperties;
	
	@Bean
	public HelloService helloService() {
		HelloService helloService = new HelloService();
		helloService.setHelloProperties(helloProperties);
		return helloService;
	}
}
