package com.study.service;

import com.study.entity.Account;
import org.springframework.stereotype.Service;

public interface AccountService {
    /**
     * 通过username查找
     * @param username
     * @return
     */
    Account findByUsername(String username);
}
