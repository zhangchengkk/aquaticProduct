package com.fire.mapper;

import com.fire.pojo.User;

import java.util.Map;

/**
 * Created by ShuFire
 * on 2017/3/31.
 * e-mail：102338496@qq.com
 * 内容说明：
 */


public interface UserMapper {
    /**
     * 功能描述：
     * 用户登录mapper接口
     */
    User findUserByNameAndPassword(User user) throws Exception;

    /**
     * 功能描述：
     * 更新用户的登录时间和登录次数
     */
    int updateUserLoginRecord(User user) throws Exception;

    /**
     * 功能描述：
     * 用户注册mapper接口
     */
    int register(User user) throws Exception;

    /**
     * 功能描述：
     * 用户密码修改的mapper接口
     */
    int changePassword(Map<String, Object> temp) throws Exception;
}
