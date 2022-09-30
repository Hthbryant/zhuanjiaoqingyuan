package com.lingyi.web.dto;

import com.lingyi.biz.entity.User;
import lombok.Data;

import java.util.List;

/**
 * @author 咕噜科
 * ClassName: QueryUserListRespDTO
 * date: 2022-10-01 1:33
 * Description:
 * version 1.0
 */
@Data
public class QueryUserListRespDTO extends BaseResponseDTO {

    private List<User> userList;

}
