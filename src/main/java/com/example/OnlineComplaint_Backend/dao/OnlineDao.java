package com.example.OnlineComplaint_Backend.dao;

import com.example.OnlineComplaint_Backend.model.OnlineUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OnlineDao extends CrudRepository<OnlineUser,Integer> {
    @Query(value = "SELECT `id`, `address`, `confirm`, `email`, `name`, `password`, `phone`, `username` FROM `user_detail` WHERE `email`= :email AND `password`= :password",nativeQuery = true)
    List<OnlineUser> UserLogin(@Param("email") String email,@Param("password") String password);
}
