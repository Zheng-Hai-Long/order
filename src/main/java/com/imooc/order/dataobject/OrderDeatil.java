package com.imooc.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by ZHL on 2018/11/9.
 */
@Data
@Entity
public class OrderDeatil {

    @Id
    private String detailId;
    private String orderId;
    private String productId;
    /**
     * '商品名称'
     */
    private String productName;
    /**
     * 当前价格,单位分
     */
    private BigDecimal productPrice;
    /**
     * 数量
     */
    private Integer productQuantity;
    /**
     * 小图
     */
    private String productIcon;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}