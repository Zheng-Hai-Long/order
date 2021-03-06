package com.imooc.order.enums;

import lombok.Getter;

/**
 * Created by ZHL on 2018/11/10.
 */
@Getter
public enum  ResultEnum {
    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空"),
    ;
    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
