package com.kontrakkan.blog.modules.user.usecase;

import com.kontrakkan.blog.modules.user.model.User;

import java.util.UUID;

public interface UserUsecaseInterface {
    User saveUser(User user);
    User findById(UUID id);
    String deleteById(UUID id);
}