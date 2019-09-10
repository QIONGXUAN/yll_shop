package com.vip.yll.utils;

import lombok.Data;

/**
 * 结果集
 */
@Data
public class Result<T> {

    private int status;
    private String msg;
    private T data;

    public static Result success(Object obj){
        Result result = new Result();
        result.setData(obj);
        result.setStatus(Constants.SUCCESS_STATUS_200);
        result.setMsg(Constants.SUCCESS_MSG);
        return result;
    }

    public static Result success(){
        Result result = new Result();
        result.setStatus(Constants.SUCCESS_STATUS_200);
        result.setMsg(Constants.SUCCESS_MSG);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setStatus(Constants.ERROE_STATUS_404);
        result.setMsg(Constants.ERROR_MSG);
        return result;
    }

}

