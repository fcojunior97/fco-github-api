package com.fco.github.infra.clients;

import com.fco.github.domain.UserRepository;
import com.fco.github.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value= "github-api", url = "https://api.github.com")
public interface GitHubResourceClient {

    @RequestMapping(method = RequestMethod.GET, path = "/users/{user}")
    User getUser(@PathVariable String user);

    @RequestMapping(method = RequestMethod.GET, path = "/users/{user}/repos")
    List<UserRepository> getRepos(@PathVariable String user);
}
