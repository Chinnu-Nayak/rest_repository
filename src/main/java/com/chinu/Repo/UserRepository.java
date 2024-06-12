package com.chinu.Repo;

import com.chinu.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

//    List<User> findByUser_name(String user_name);
User findByUserName(String userName);
}