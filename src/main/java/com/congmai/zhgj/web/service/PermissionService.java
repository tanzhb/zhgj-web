package com.congmai.zhgj.web.service;

import java.util.List;

import com.congmai.zhgj.core.generic.GenericService;
import com.congmai.zhgj.web.model.Permission;

/**
 * 
 * @ClassName PermissionService
 * @Description 权限 业务接口
 * @author tanzb
 * @Date 2017年7月26日 下午2:54:46
 * @version 1.0.0
 */
public interface PermissionService extends GenericService<Permission, Long> {

    /**
     * 通过角色id 查询角色 拥有的权限
     * 
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);

}
