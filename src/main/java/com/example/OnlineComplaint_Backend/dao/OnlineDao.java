package com.example.OnlineComplaint_Backend.dao;

import com.example.OnlineComplaint_Backend.model.OnlineUser;
import org.springframework.data.repository.CrudRepository;

public interface OnlineDao extends CrudRepository<OnlineUser,Integer> {
}
