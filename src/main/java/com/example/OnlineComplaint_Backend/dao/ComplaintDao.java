package com.example.OnlineComplaint_Backend.dao;

import com.example.OnlineComplaint_Backend.model.Complaints;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface ComplaintDao extends CrudRepository<Complaints,Integer> {

    @Query(value = "SELECT  u.address, u.`email`, u.`name`, u.`phone`, c.complaints FROM `user_detail` u JOIN complaints c ON u.id=c.user_id",nativeQuery = true)
    List<Map<String,String>> ViewAllComplaint();
}
