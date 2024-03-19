package com.zoromart.controllers;

import com.zoromart.model.User;
import com.zoromart.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({ "", "/", "/test" })
    @ResponseBody
    public String getTest() {
        return "working - controller test !!!";
    }

    @RequestMapping({ "/stest", "/sTest", "/serviceTest" })
    @ResponseBody
    public String getServiceTest() {
        User user = new User();
        user.setFullName("controller-setter-fullName");

        return "working - service test --> "+userService.serviceTest(user);
    }
}
