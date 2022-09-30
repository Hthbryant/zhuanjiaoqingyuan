package com.lingyi.biz.integration.dao;

import com.lingyi.biz.entity.User;
import com.lingyi.web.dto.QueryUserListReqDTO;

import java.util.List;

/**
 * @author 咕噜科
 * ClassName: UserDao
 * date: 2022-10-01 1:24
 * Description:
 * version 1.0
 */
public interface UserDao {

    List<User> queryUserList (QueryUserListReqDTO request);

}
