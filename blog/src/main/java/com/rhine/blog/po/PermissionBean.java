package com.rhine.blog.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 权限类
 * @author y'l'l
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionBean implements Serializable {
    private String id;
    private String name;
    private String url;
}
