package com.lingyi.web.controller;

import com.lingyi.biz.service.UserService;
import com.lingyi.web.dto.QueryUserListReqDTO;
import com.lingyi.web.dto.QueryUserListRespDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 咕噜科
 * ClassName: UserController
 * date: 2022-10-01 1:19
 * Description:
 * version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello () {
        return "hello world";
    }

    @RequestMapping("/list")
    public QueryUserListRespDTO list (@RequestBody QueryUserListReqDTO request) {
        return userService.queryUserList(request);
    }

}
