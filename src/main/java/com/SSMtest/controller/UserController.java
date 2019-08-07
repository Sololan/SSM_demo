package com.SSMtest.controller;


import com.SSMtest.POJO.User;
import com.SSMtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/success")
    public String success(){
        return "success";
    }

    @RequestMapping("/getUser")
    public String getUser(@RequestParam(value = "id",defaultValue = "102") Integer userId, Model model){
        User user = userService.getUserById(userId);
        model.addAttribute("user",user);
        return "success";
    }
}
