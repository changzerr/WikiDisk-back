package com.changzer.wiki.service;/**
 * @author lingqu
 * @date 2022/3/1
 * @apiNote
 */

import com.changzer.wiki.entity.User;
import com.changzer.wiki.utils.Result;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/3/1
 *@version 1.0
 */
public interface LoginService {
    Result login(User user);

    Result logout();

    Result register(User user);
}
