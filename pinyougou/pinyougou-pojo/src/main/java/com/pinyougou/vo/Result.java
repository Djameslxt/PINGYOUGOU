package com.pinyougou.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Date:2020/6/19
 * Author:  james L
 * Desc:
 */
@Data
public class Result implements Serializable{
    private Boolean success;
    private String message;

    public Result(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public static Result ok(String message){
        return new Result(true, message);
    }

    public static Result fail(String message){
        return new Result(false, message);
    }

}
