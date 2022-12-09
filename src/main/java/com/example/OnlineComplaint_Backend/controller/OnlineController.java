package com.example.OnlineComplaint_Backend.controller;

import com.example.OnlineComplaint_Backend.dao.OnlineDao;
import com.example.OnlineComplaint_Backend.model.OnlineUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OnlineController {

    @Autowired
    private OnlineDao dao;

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> AddUser(@RequestBody OnlineUser o)
    {
        System.out.println(o.getAddress().toString());
        System.out.println(o.getName().toString());
        System.out.println(o.getEmail().toString());
        System.out.println(o.getUsername().toString());
        System.out.println(o.getPhone());
        System.out.println(o.getPassword().toString());
        System.out.println(o.getConfirm().toString());
        dao.save(o);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
}
