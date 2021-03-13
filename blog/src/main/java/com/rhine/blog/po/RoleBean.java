package com.rhine.blog.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 角色类
 * @author y'l'l
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleBean implements Serializable {
    private String id;
    private String name;
    private Set<PermissionBean> permissions = new HashSet<>();

    // 省略setter、getter方法
}
