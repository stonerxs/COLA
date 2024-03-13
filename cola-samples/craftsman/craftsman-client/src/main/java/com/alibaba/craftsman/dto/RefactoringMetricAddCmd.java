package com.alibaba.craftsman.dto;

import com.alibaba.craftsman.dto.clientobject.MiscMetricCO;
import com.alibaba.craftsman.dto.clientobject.RefactoringMetricCO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * RefactoringMetricAddCmd
 *
 * @author Frank Zhang
 * @date 2019-03-04 11:04 AM
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RefactoringMetricAddCmd extends CommonCommand{
    @NotNull
    private RefactoringMetricCO refactoringMetricCO;
}
