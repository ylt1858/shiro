package com.rhine.blog.service;

import com.rhine.blog.po.UserBean;

/**
 * UserService抽象接口
 */
public interface UserService {
    /**
     * 查找
     * @param name
     * @return
     */
    UserBean findByName(String name);
}
