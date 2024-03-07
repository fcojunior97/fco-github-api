package com.fco.github.domain.service;

import com.fco.github.domain.model.User;
import com.fco.github.domain.model.UserRepository;
import com.fco.github.infra.clients.GitHubResourceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
