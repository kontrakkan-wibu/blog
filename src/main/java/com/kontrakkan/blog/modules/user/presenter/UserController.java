package com.kontrakkan.blog.modules.user.presenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") String id){
        return null;
    }
}
