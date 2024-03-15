package com.alibaba.cola.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

/**
 * Response with single record to return
 * <p/>
 * Created by Danny.Lee on 2017/11/1.
 */
@Setter
@Getter
public class SingleResponse<T> extends Response {

    @Serial
    private static final long serialVersionUID = 1L;

    private T data;

    public static SingleResponse<Void> buildSuccess() {
        SingleResponse<Void> response = new SingleResponse<>();
        response.setSuccess(true);
        return response;
    }

    public static SingleResponse<Void> buildFailure(String errCode, String errMessage) {
        SingleResponse<Void> response = new SingleResponse<>();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }

    public static <T> SingleResponse<T> of(T data) {
        SingleResponse<T> response = new SingleResponse<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }

}
