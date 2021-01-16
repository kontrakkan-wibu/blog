package com.kontrakkan.blog.modules.user.presenter;

import com.kontrakkan.blog.helper.Log;
import com.kontrakkan.blog.modules.user.model.User;
import com.kontrakkan.blog.modules.user.usecase.UserUsecaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class UserController {

    @Autowired
    @Qualifier(value = "userUsecase")
    UserUsecaseInterface userUsecase;


    @GetMapping("/user/create")
    @ResponseBody
    public String getUserById(){

        User newUser = new User();
        newUser.setUsername("rizalhamdana");
        newUser.setFullName("Rizal Hamdan");
        newUser.setEmail("ari.gusti12@gmail.com");
        newUser.setPassword("21mei1998");
        newUser.setBio("hello World");

        newUser = userUsecase.saveUser(newUser);

        if (newUser == null) {
            return "<h1>Failed save</h1>";
        }
        return "<h1>"+newUser.getId()+"</h1>";
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public String getUserById(@PathVariable("id") String id){
        User user;
        try {
            user = userUsecase.findById(UUID.fromString(id));
        } catch (Exception e) {
            Log.errorLog(e.getMessage(), UserController.class);
            return "<h1>Invalid id</h1>";
        }

        if (user == null) {
            return "<h1>Not found</h1>";
        }
        return "<h1>"+user.getUsername()+"</h1>";
    }

    @GetMapping("/user/delete/{id}")
    @ResponseBody
    public String deleteUserById(@PathVariable("id") String id){

        String resultMessage = userUsecase.deleteById(UUID.fromString(id));

        if (resultMessage == null) {
            return "<h1>Failed delete</h1>";
        }
        return "<h1>"+resultMessage+"</h1>";
    }
}
