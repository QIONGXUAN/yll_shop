package com.vip.yll.domain.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ShopDetail {
    /**
     * 商品详细信息id
     */
    private Integer shopDetailId;

    /**
     * 商品id
     */
    private Integer shopId;

    /**
     * 商品属性值id
     */
    private String shopPropertyValueIds;

    /**
     * 商品对应的库存
     */
    private Integer shopStock;

    /**
     * 商品对应的新价格
     */
    private BigDecimal shopNewPrice;

    /**
     * 商品对应的旧价格
     */
    private BigDecimal shopOldPrice;

    /**
     * 商品状态：1-在售 2-下架 3-删除【默认1】
     */
    private Integer shopDetailStatus;
}