package com.lingyi.biz.service.impl;

import com.lingyi.biz.entity.User;
import com.lingyi.biz.integration.dao.UserDao;
import com.lingyi.biz.service.UserService;
import com.lingyi.web.dto.QueryUserListReqDTO;
import com.lingyi.web.dto.QueryUserListRespDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 咕噜科
 * ClassName: UserServiceImpl
 * date: 2022-10-01 1:12
 * Description:
 * version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public QueryUserListRespDTO queryUserList(QueryUserListReqDTO requestDTO) {
        List<User> users = userDao.queryUserList(requestDTO);
        QueryUserListRespDTO responseDTO = new QueryUserListRespDTO();
        responseDTO.setUserList(users);
        return responseDTO;
    }
}
