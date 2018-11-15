package com.imooc.order.vo;

import lombok.Data;

/**
 * Created by ZHL on 2018/11/10.
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

    public ResultVO(){

    }

    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
