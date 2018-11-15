package com.imooc.order.dto;

import lombok.Data;

/**
 * Created by ZHL on 2018/11/10.
 */
@Data
public class CartDTO {

    /**
     * 商品的id
     */
    private String productId;

    /**
     * 商品的数量
     */
    private Integer productQuantuty;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantuty) {
        this.productId = productId;
        this.productQuantuty = productQuantuty;
    }
}
