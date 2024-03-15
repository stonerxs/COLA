package com.alibaba.cola.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * This is the object communicate with Client.
 * The clients could be view layer or other HSF Consumers
 * @author fulan.zjf 2017-10-27 PM 12:19:15
 */
@Setter
@Getter
public abstract class ClientObject implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * This is for extended values
     */
    protected Map<String, Object> extValues = new HashMap<String, Object>();

    public Object getExtField(String key){
        if(extValues != null){
            return extValues.get(key);
        }
        return null;
    }

    public void putExtField(String fieldName, Object value){
        this.extValues.put(fieldName, value);
    }

}
