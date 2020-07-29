package com.sub.service;

import com.sub.model.UserCount;
import com.sub.model.UserName;
import com.sub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<UserName> getN (){
        return repo.getNameUsers();
    }

    public List<UserCount> getC(){
        return repo.getOwnQuery();
    }

}
