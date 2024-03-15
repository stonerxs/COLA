package com.alibaba.cola.dto;

import lombok.Setter;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Response with batch record to return,
 * usually use in conditional query
 * <p/>
 * Created by Danny.Lee on 2017/11/1.
 */
@Setter
public class MultiResponse<T> extends Response {

    @Serial
    private static final long serialVersionUID = 1L;

    private Collection<T> data;

    public List<T> getData() {
        if (null == data) {
            return Collections.emptyList();
        }
        if (data instanceof List) {
            return (List<T>) data;
        }
        return new ArrayList<>(data);
    }

    public boolean isEmpty() {
        return data == null || data.isEmpty();
    }

    public boolean isNotEmpty() {
        return !isEmpty();
    }

    public static MultiResponse<Void> buildSuccess() {
        MultiResponse<Void> response = new MultiResponse<>();
        response.setSuccess(true);
        return response;
    }

    public static MultiResponse<Void> buildFailure(String errCode, String errMessage) {
        MultiResponse<Void> response = new MultiResponse<>();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }

    public static <T> MultiResponse<T> of(Collection<T> data) {
        MultiResponse<T> response = new MultiResponse<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }

}
