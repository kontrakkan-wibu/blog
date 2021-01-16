package com.kontrakkan.blog.modules.user.repo;

import com.kontrakkan.blog.helper.Parameters;
import com.kontrakkan.blog.modules.user.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
@Qualifier("userRepo")
public interface UserRepoInterface extends JpaRepository<User, UUID> {

}