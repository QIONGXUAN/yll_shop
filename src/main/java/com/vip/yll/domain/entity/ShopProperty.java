package com.vip.yll.domain.entity;

import lombok.Data;

@Data
public class ShopProperty {
    /**
     * 商品属性id
     */
    private Integer shopPropertyId;

    /**
     * 商品属性名
     */
    private String shopPropertyName;

    /**
     * 是否删除：1是  0否【默认0】
     */
    private Integer shopPropertyIsDelete;
}