package com.lingyi.biz.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 咕噜科
 * ClassName: User
 * date: 2022-10-01 1:23
 * Description:
 * version 1.0
 */
@Data
public class User implements Serializable {

    private Integer userId;
    private String userName;
    private Integer userAge;
    private String userPhone;

}
