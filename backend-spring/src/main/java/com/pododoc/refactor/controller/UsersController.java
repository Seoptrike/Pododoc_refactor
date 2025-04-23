package com.pododoc.refactor.controller;

import com.pododoc.refactor.dao.UsersDAO;
import com.pododoc.refactor.domain.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UsersDAO udao;
    @PostMapping("/list")
    public List<HashMap<String, Object>> list(){
        return udao.list();
    }

}
