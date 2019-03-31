package com.sn.tonux.controller;

import com.sn.tonux.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("message", "Spring MVC, ziar naleen!!");
        return "hello";
    }


    @RequestMapping(value = "/users")
    public String users(Model model) {
        List<User> users = new ArrayList<>();

        users = initListUser();

        model.addAttribute("users", users);
        return "users";

    }


    private List<User> initListUser() {

        List<User> users = new ArrayList<User>();
        User user1 = new User("SAMB", "Ndongo", "28");
        User user2 = new User("Thiam", "Thierno", "99");
        User user3 = new User("SYLLA", "BABACAR", "100");


        users.add(user1);
        users.add(user2);
        users.add(user3);


        return users;

    }

}