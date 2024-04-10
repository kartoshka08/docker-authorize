package com.example.docker_AS.repository;

import com.example.docker_AS.model.Authorities;

import java.util.List;

public interface UserRepositoryInterface {
    public List<Authorities> getUserAuthorities(String user, String password);
}