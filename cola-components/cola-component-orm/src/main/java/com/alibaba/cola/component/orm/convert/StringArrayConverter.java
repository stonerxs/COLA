package com.alibaba.cola.component.orm.convert;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

/**
 * @author zgh
 * @ClassName StringArrayConverter
 * @description: TODO
 * @date 2024年03月13日
 */
@Converter
public class StringArrayConverter implements AttributeConverter<String[], String> {

    private static final String DELIMITER = ";"; // 用于分隔字符串数组中的元素

    @Override
    public String convertToDatabaseColumn(String[] attribute) {
        if (attribute == null || attribute.length == 0) {
            return null;
        }
        return String.join(DELIMITER, attribute);
    }

    @Override
    public String[] convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return null;
        }
        return dbData.split(DELIMITER);
    }
}
