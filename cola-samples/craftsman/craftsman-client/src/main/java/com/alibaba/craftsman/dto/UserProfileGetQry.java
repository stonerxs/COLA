package com.alibaba.craftsman.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserProfileGetQry extends CommonCommand {
    private String userId;
    private String id;

    public UserProfileGetQry(){

    }

}
