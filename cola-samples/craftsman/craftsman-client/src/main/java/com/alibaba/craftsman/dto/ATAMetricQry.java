package com.alibaba.craftsman.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ATAMetricQry extends CommonCommand {
    public String ownerId;
}

