package com.fco.github;

import com.fco.github.domain.User;
import com.fco.github.infra.clients.GitHubResourceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FcoGithubApiApplication {

	@Autowired
	private GitHubResourceClient gitHubResourceClient;

	public static void main(String[] args) {
		SpringApplication.run(FcoGithubApiApplication.class, args);
	}

}
