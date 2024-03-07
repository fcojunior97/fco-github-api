package com.fco.github.domain.service;

import com.fco.github.domain.User;
import com.fco.github.domain.UserRepository;
import com.fco.github.infra.clients.GitHubResourceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserGitService {

    @Autowired
    private GitHubResourceClient gitHubResourceClient;

    public User getUser(String user) {
        return gitHubResourceClient.getUser(user);
    }

    public List<UserRepository> getRepos(String user) {
        User userGit = gitHubResourceClient.getUser(user);
        List<UserRepository> userRepository =  gitHubResourceClient.getRepos(user);

        return userRepository
                .stream()
                .peek(repo -> repo.setOwner(userGit))
                .toList();
    }
}
