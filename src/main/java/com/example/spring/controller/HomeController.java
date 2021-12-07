package com.example.spring.controller;

import com.example.spring.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value = {"","/"} )
    public String getHome(ModelMap map) {
        map.addAttribute("message","Poly");

        UserModel user = new UserModel("HuyPN2", "huypn6@fpt.edu.vn", true);
        map.addAttribute("user", user);

        ArrayList<UserModel> arrayList = new ArrayList<UserModel>();
        arrayList.add(user);
        arrayList.add(user);
        arrayList.add(user);
        map.addAttribute("list", arrayList);

        return "index";
    }

    @GetMapping(value = { "/contact" })
    public String getContact(ModelMap map) {
        return "contact";
    }

    @PostMapping(value = { "/contact" })
    public String sendMessageContact(ModelMap map) {
        return "index";
    }

}
