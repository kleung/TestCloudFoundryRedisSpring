package com.test.TestCloudFoundryRedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisReactiveAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
@ImportResource(value= {"classpath:redis-context.xml"})
@EnableAutoConfiguration(exclude={RedisReactiveAutoConfiguration.class})
public class TestCloudFoundryRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCloudFoundryRedisApplication.class, args);
	}
}
