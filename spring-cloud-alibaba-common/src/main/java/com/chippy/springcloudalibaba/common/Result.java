package com.chippy.springcloudalibaba.common;

import lombok.Data;

import java.io.Serializable;

/**
 * response wrap entity
 *
 * @author chippy
 */
@Data
public class Result<T> implements Serializable, com.chippy.core.common.response.Result<T> {

    /**
     * 错误码,默认值0位成功
     */
    protected int errorCode = 0;

    /**
     * 错误消息
     */
    protected String errorMsg;

    /**
     * 返回的实体类
     */
    private T data;

    public Result() {
        super();
    }

    public Result(int errorCode, String errorMsg, T data) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    /**
     * 重写toString方法
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Result { \n");
        sb.append("        errorCode    = ").append(errorCode).append(",\n");
        sb.append("        errorMsg = ").append(errorMsg);
        sb.append("\n}");
        return sb.toString();
    }

    public static <T> Result<T> success() {
        return new Result<>();
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.data = data;
        return result;
    }

    public static <T> Result<T> fail(int errorCode, String errorMsg) {
        Result<T> result = new Result<>();
        result.errorCode = errorCode;
        result.errorMsg = errorMsg;
        return result;
    }

    @Override
    public int definitionSuccessCode() {
        return 0;
    }

    @Override
    public int getCode() {
        return errorCode;
    }
}
