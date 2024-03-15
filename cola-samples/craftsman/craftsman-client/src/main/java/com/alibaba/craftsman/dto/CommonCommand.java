package com.alibaba.craftsman.dto;

import com.alibaba.cola.dto.Command;
import lombok.Data;
import lombok.Getter;

/**
 * 整个应用通用的Command
 *
 * @author Frank Zhang
 * @date 2019-02-28 7:18 PM
 */
@Getter
public class CommonCommand extends Command{

    private String operator;

    private boolean needsOperator;

    public void setOperator(String operator) {
        this.operator = operator;
        needsOperator = true;
    }

}
