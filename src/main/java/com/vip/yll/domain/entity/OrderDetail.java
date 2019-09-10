package com.vip.yll.domain.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class OrderDetail {
    /**
     * 订单详情表id【相当于属性值id】
     */
    private Integer orderDetailId;

    /**
     * 订单id【相当于属性id】
     */
    private Integer orderId;

    /**
     * 购物车id【相当于属性值】
     */
    private Integer shopcartId;

    /**
     * 商品单价
     */
    private BigDecimal shopPrice;

    /**
     * 商品数量
     */
    private Integer shopNum;

    /**
     * 商品运费【默认0】
     */
    private BigDecimal shopFreight;

    /**
     * 状态：1正常  0删除【默认1】
     */
    private Integer orderDetailStatus;
}