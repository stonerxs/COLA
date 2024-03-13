package com.alibaba.craftsman.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class RefreshScoreCmd extends CommonCommand{
    private String userId;
}
