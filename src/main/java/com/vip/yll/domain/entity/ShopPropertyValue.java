package com.vip.yll.domain.entity;

import lombok.Data;

@Data
public class ShopPropertyValue {
    /**
     * 商品属性值id
     */
    private Integer shopPropertyValueId;

    /**
     * 商品属性id
     */
    private Integer shopPropertyId;

    /**
     * 商品id
     */
    private Integer shopId;

    /**
     * 商品属性值
     */
    private String shopPropertyValue;

    /**
     * 是否删除：1是  0否【默认0】
     */
    private Integer shopPropertyValueIsDelete;
}