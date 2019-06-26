package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.api.UserService;
import dubbo.entity.UserDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @Description:
 * @author: zhoum
 * @Date: 2019-06-26
 * @Time: 9:50
 */
@Path("/user")
@Service(protocol = {"rest","dubbo"})
public class UserServiceImpl implements UserService {
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Override
    public UserDTO getUserById(@PathParam("id") String id) {
        UserDTO u= new UserDTO();
        u.setUsername("用户名："+id);
        u.setPassword("12346");
        return u;
    }
}
