package com.yuknis.logs.demo;

import com.yuknis.logs.demo.functions.CharCount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Function;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Function<String, Message<Integer>> charCountFn ( )
	{
		return (new CharCount ( ));
	}
}
