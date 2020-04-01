package com.example.demo;

import akka.actor.ActorSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AkkaPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkkaPocApplication.class, args);

		ActorSystem actorSystem = ActorSystem.create("Hello System");
	}

}
