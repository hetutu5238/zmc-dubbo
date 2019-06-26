package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.api.UserService;
import dubbo.entity.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @Description:
 * @author: zhoum
 * @Date: 2019-06-26
 * @Time: 9:55
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerContoller {

    @Autowired
    private RestTemplate restTemplate;

    @Reference
    private UserService userService;

    @GetMapping("/user")
    public UserDTO getUser(){
        UserDTO user = restTemplate.getForObject("http://localhost:8888/user/123" , UserDTO.class , new HashMap<>());
        System.out.println(user);
        UserDTO wo = userService.getUserById("wo");
        return wo;
    }
}
