package com.kontrakkan.blog.modules.user.repo;

import com.kontrakkan.blog.helper.Parameters;
import com.kontrakkan.blog.modules.user.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "userRepo")
public class UserRepoImpl implements UserRepoInterface{

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public List<User> getListUser(Parameters params) {
        return null;
    }

    @Override
    public String addUser(User user) {
        return null;
    }

    @Override
    public String updateUser(User user) {
        return null;
    }

    @Override
    public String deleteUser(String id) {
        return null;
    }
}
