package com.example.Chat_2024_06_03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // @CreatedDate, @ModifyedDate를 사용하기위함
public class Chat20240603Application {

	public static void main(String[] args) {
		SpringApplication.run(Chat20240603Application.class, args);
	}

}
