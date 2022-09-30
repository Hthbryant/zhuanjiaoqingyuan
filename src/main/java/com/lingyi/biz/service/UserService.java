package com.lingyi.biz.service;

import com.lingyi.web.dto.QueryUserListReqDTO;
import com.lingyi.web.dto.QueryUserListRespDTO;

/**
 * @author 咕噜科
 * ClassName: UserSrevice
 * date: 2022-10-01 1:11
 * Description:
 * version 1.0
 */
public interface UserService {

    QueryUserListRespDTO queryUserList (QueryUserListReqDTO requestDTO);

}
