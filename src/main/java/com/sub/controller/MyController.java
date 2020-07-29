package com.sub.controller;

import com.sub.model.User;
import com.sub.model.UserCount;
import com.sub.model.UserName;
import com.sub.repository.UserRepository;
import com.sub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserRepository repo;

    @Autowired
    private UserService repoService;

    @GetMapping("/") //1.it's work
    ResponseEntity<List<User>> getAllCity(Pageable page){
        return ResponseEntity.ok(repo.getAll());
    }
    @GetMapping("/s") //2.it's work
    ResponseEntity<List<User>> getAllUsers(Pageable page){
        return ResponseEntity.ok(repo.findByFirstnameEndsWith("Seba"));
    }
    @GetMapping("/f") ///3.don't work
    ResponseEntity<List<UserName> >getUsersName(Pageable page){
        return ResponseEntity.ok(repoService.getN());
    }
    @GetMapping("/c") ///4.don't work
    ResponseEntity<List<UserCount> >getUsersCount(Pageable page){
        return ResponseEntity.ok(repoService.getC());
    }



}
