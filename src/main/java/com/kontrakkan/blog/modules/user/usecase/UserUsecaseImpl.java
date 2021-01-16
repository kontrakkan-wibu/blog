package com.kontrakkan.blog.modules.user.usecase;

import com.kontrakkan.blog.helper.Log;
import com.kontrakkan.blog.modules.user.model.User;
import com.kontrakkan.blog.modules.user.repo.UserRepoInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

import java.util.UUID;

@Component(value = "userUsecase")
public class UserUsecaseImpl implements UserUsecaseInterface {

    @Autowired
    private UserRepoInterface userRepo;

    @Override
    public User saveUser(User user) {
        User userCreated;
        try {
            userCreated =  userRepo.save(user);
        } catch (Exception exception) {
            Log.errorLog(exception.getMessage(), UserUsecaseImpl.class);
            return null;
        }
        return userCreated;

    }

    @Override
    public User findById(UUID id) {
        User user;
        try {
            if (userRepo.findById(id).isPresent()){
                user = userRepo.findById(id).get();
            } else {
                throw new Exception("User with specified ID is not found");
            }
        } catch (Exception exception){
            Log.errorLog(exception.getMessage(), UserUsecaseImpl.class);
            return null;
        }
        return user;
    }

    @Override
    public String deleteById(UUID id) {
        try {
            userRepo.deleteById(id);
            Log.infoLog("User with id" + id.toString() + "successfully deleted", UserUsecaseImpl.class);
        }catch (Exception exception){
            Log.errorLog(exception.getMessage(), UserUsecaseImpl.class);
            return null;
        }
        return "User successfully deleted";
    }
}