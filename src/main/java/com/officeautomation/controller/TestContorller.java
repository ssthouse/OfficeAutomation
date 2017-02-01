package com.officeautomation.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ssthouse on 01/02/2017.
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class TestContorller {

    @RequestMapping("/{username}")
    public String getUserInfo(@PathVariable String username) {
        return new Gson().toJson(new UserIno(username, 22));
    }

}
