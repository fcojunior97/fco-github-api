package com.fco.github.api.resource;

import com.fco.github.domain.model.UserRepository;
import com.fco.github.domain.model.User;
import com.fco.github.domain.service.UserGitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserGitResource {

    @Autowired
    private UserGitService userGitService;

    @GetMapping("/{user}")
    public User getUsers(@PathVariable String user) {
        return userGitService.getUser(user);
    }

    @GetMapping("/{user}/repos")
    public List<UserRepository> getReposUser(@PathVariable String user) {
        return userGitService.getRepos(user);
    }


}
