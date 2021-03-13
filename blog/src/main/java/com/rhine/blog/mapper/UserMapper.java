package com.rhine.blog.mapper;

import com.rhine.blog.po.UserBean;

public interface UserMapper {
    /**
     * 查询用户信息
     * @param name
     * @return
     */
    UserBean findByName(String name);

    /**
     * 查询用户信息、角色、权限
     * @param id
     * @return
     */
    UserBean findById(String id);
}
