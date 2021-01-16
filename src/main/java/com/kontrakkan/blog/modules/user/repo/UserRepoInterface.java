package com.kontrakkan.blog.modules.user.repo;

import com.kontrakkan.blog.helper.Parameters;
import com.kontrakkan.blog.modules.user.model.User;

import java.util.List;

public interface UserRepoInterface {
    User getUserById(String id);
    List<User> getListUser(Parameters params);
    String addUser(User user);
    String updateUser(User user);
    String deleteUser(String id);



}