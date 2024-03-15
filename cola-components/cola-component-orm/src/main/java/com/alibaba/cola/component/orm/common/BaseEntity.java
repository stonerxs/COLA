package com.alibaba.cola.component.orm.common;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

/**
 * @author zgh
 * @ClassName TimeBaseEntity
 * @description: TODO
 * @date 2024年03月13日
 */
@Data
@MappedSuperclass
public class BaseEntity {

    @CreatedDate
    private LocalDateTime createTime;

    @LastModifiedDate
    private LocalDateTime updatedTime;

}
