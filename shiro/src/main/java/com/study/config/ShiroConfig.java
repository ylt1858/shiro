package com.study.config;

import com.study.realm.AccountRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * 认证过滤器：
 * anon：无需认证
 * authc：必须认证
 * authcBasic：需要通过httpbasic认证
 * user：shiro记录，记住我
 *
 * 授权过滤器：
 * perms：必须有某个权限才能访问
 * role：必须有某个角色才能访问
 * port：请求端口必须是指定值才可以
 * ssl：必须是安全的URL请求，协议：HTTPS
 */

@Configuration
public class ShiroConfig {
    /**
     * 第三步
     * @param defaultWebSecurityManager
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        // 权限设置
        Map<String,String> map = new HashMap<>(4);
        map.put("/main","authc");
        map.put("/manager","perms[manager]");
        map.put("/administrator","roles[administrator]");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        // 设置跳转登录页面
        shiroFilterFactoryBean.setLoginUrl("/login");
        // 设置为授权页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/unAuth");
        return shiroFilterFactoryBean;
    }

    /**
     * 第二步
     * @param accountRealm
     * @return
     */
    @Bean
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("accountRealm") AccountRealm accountRealm) {
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        manager.setRealm(accountRealm);
        return manager;
    }

    /**
     * 第一步
     * @return
     */
    @Bean(name = "accountRealm")
    public AccountRealm accountRealm() {
        return new AccountRealm();
    }
}
