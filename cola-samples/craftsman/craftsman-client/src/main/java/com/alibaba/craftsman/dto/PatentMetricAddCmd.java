package com.alibaba.craftsman.dto;

import com.alibaba.craftsman.dto.clientobject.ATAMetricCO;
import com.alibaba.craftsman.dto.clientobject.PatentMetricCO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * PatentMetricAddCmd
 *
 * @author Frank Zhang
 * @date 2019-03-03 11:37 AM
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PatentMetricAddCmd extends CommonCommand{
    @NotNull
    private PatentMetricCO  patentMetricCO;
}
