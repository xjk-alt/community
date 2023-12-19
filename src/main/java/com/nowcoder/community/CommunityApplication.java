package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityApplication {

	public static void main(String[] args) {
		//Spring 容器自动被创建，自动扫描bean，装配到容器中
		SpringApplication.run(CommunityApplication.class, args);
	}

}
