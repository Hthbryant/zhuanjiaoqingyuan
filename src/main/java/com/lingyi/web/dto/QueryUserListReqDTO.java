package com.lingyi.web.dto;

import lombok.Data;

/**
 * @author 咕噜科
 * ClassName: QueryUserListReqDTO
 * date: 2022-10-01 1:32
 * Description:
 * version 1.0
 */
@Data
public class QueryUserListReqDTO {

    private Integer userId;
    private Integer userAge;
    private String userName;
    private String userPhone;

}
